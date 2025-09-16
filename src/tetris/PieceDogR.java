
package tetris;
public class PieceDogR extends Rotarpieza {
    public PieceDogR() {
        super(
            new int[][] {
                {1,  1,  0},
                {0, 1,  1},
                {0, 0, 0}
            }, // 0°
            new int[][] {
                {0, 1 },
                {1,  1 },
                {1,  0}
            }, // 90°
            new int[][] {
                {0, 0, 0},
                {1,  1,  0},
                {0, 1,  1}
            }, // 180°
            new int[][] {
                {0, 1 },
                {1,  1 },
                {1,  0}
            }  // 270°
        );
    }
}

