package tetris;
public class PieceT extends Rotarpieza {
    public PieceT() {
        super(
            new int[][] {
                {0, 1, 0},
                {1, 1, 1},
                {0, 0, 0}
            }, // 0°
            new int[][] {
                {0, 1, 0 },
                {0, 1, 1 },
                {0, 1, 0}
            }, // 90°
            new int[][] {
                {0, 0, 0},
                {1, 1, 1},
                {0, 1, 0}
            }, // 180°
            new int[][] {
                {0, 1, 0 },
                {1, 1, 0 },
                {0, 1, 0}
            }  // 270°
        );
    }
}



