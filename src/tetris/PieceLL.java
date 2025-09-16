package tetris;
public class PieceLL extends Rotarpieza {
    public PieceLL() {
        super(
            new int[][] {
                {1, 0, 0},
                {1, 1,  1},
                {0, 0, 0}
            }, // 0°
            new int[][] {
                {0, 1,  1},
                {0, 1,  0},
                {0, 1,  0}
            }, // 90°
            new int[][] {
                {0, 0, 0},
                {1,  1,  1},
                {0, 0, 1}
            }, // 180°
            new int[][] {
                {0, 1,  0},
                {0, 1,  0},
                {1,  1,  0}
            }  // 270°
        );
    }
}

    

