
public class PieceStick extends Rotarpieza {
    public PieceStick() {
        super(
            new boolean[][] { {true, true, true, true} },        // 0°
            new boolean[][] { {true}, {true}, {true}, {true} },  // 90°
            new boolean[][] { {true, true, true, true} },        // 180° (igual a 0°)
            new boolean[][] { {true}, {true}, {true}, {true} }   // 270° (igual a 90°)
        );
    }
}

