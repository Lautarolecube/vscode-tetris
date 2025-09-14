

public class PieceDogR extends Rotarpieza {
    public PieceDogR() {
        super(
            new boolean[][] {
                {true,  true,  false},
                {false, true,  true},
                {false, false, false}
            }, // 0°
            new boolean[][] {
                {false, true },
                {true,  true },
                {true,  false}
            }, // 90°
            new boolean[][] {
                {false, false, false},
                {true,  true,  false},
                {false, true,  true}
            }, // 180°
            new boolean[][] {
                {false, true },
                {true,  true },
                {true,  false}
            }  // 270°
        );
    }
}

