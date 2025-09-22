package tetris;
public class PieceLR extends Piece {
    public PieceLR() {
        super(
            new int[][] {
                {0, 0, 1},
                {1,  1,  1},
                {0, 0, 0}
            }, // 0°
            new int[][] {
                {0, 1,  0},
                {0, 1,  0},
                {0, 1,  1}
            }, // 90°
            new int[][] {
                {0, 0, 0},
                {1,  1,  1},
                {1,  0, 0}
            }, // 180°
            new int[][] {
                {1,  1,  0},
                {0, 1,  0},
                {0, 1,  0}
            }  // 270°
        );
    }
}


