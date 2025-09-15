package tetris;
public class PieceLL extends Rotarpieza {
    public PieceLL() {
        super(
            new boolean[][] {
                {true, false, false},
                {true, true,  true},
                {false, false, false}
            }, // 0°
            new boolean[][] {
                {false, true,  true},
                {false, true,  false},
                {false, true,  false}
            }, // 90°
            new boolean[][] {
                {false, false, false},
                {true,  true,  true},
                {false, false, true}
            }, // 180°
            new boolean[][] {
                {false, true,  false},
                {false, true,  false},
                {true,  true,  false}
            }  // 270°
        );
    }
}

    

