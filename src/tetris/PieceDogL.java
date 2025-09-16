package tetris;
public class PieceDogL extends Rotarpieza {
    public PieceDogL() {
        super(
            new int[][] {
                {0, 1, 1},
                {1, 1, 0},
                {0, 0, 0}
            }, // 0°
            new int[][] {
                {1, 0},
                {1, 1},
                {0, 1}
            }, // 90°
            new int[][] {
                {0, 0, 0},
                {0, 1, 1},
                {1, 1, 0}
            }, // 180°
            new int[][] {
                {1, 0},
                {1, 1},
                {0, 1}
            }  // 270°
        );
    }
}


    
