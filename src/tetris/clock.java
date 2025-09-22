package tetris;

import java.util.Objects;

public final class clock implements Itick {

    private final Runnable onTick;  // acción a ejecutar cada tick
    private final int threshold;   // acumula ticks hasta llegar a 2 y entonces baja 1 celda
    private int counter = 0;       // contador de ticks se resetea al llegar a threshold (2 ticks)
    
    // baja cada 'threshold' ticks
    public clock(Runnable onTick, int threshold) {
        this.onTick = Objects.requireNonNull(onTick, "onTick no puede ser null"); // acción a ejecutar no pude ser null
        if (threshold < 1) throw new IllegalArgumentException("threshold debe ser >= 1"); // sirve para bajar cada n ticks, n debe ser >= 1 ya 0 o negativo no tiene sentido
        this.threshold = threshold;
    }
 
    // baja cada 2 ticks (Contrusctor alternativo)
    public clock(Runnable onTick) {
        this(onTick, 2);
    }

    // un tick no baja, 2 ticks si baja
    @Override
    public void tick() {
        counter++;
        if (counter >= threshold) {
            counter = 0;
            try {
                onTick.run(); //baja una celda
            } catch (Throwable t) {
                t.printStackTrace(); // Manejo de erroes
            }
        }
    }

}

