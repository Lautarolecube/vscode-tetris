package tetris;
public class PieceDogL extends Rotarpieza {
    public PieceDogL() {
        super(
            new boolean[][] {
                {false, true,  true},
                {true,  true,  false},
                {false, false, false}
            }, // 0°
            new boolean[][] {
                {true,  false},
                {true,  true },
                {false, true }
            }, // 90°
            new boolean[][] {
                {false, false, false},
                {false, true,  true},
                {true,  true,  false}
            }, // 180°
            new boolean[][] {
                {true,  false},
                {true,  true },
                {false, true }
            }  // 270°
        );
    }
}


    
