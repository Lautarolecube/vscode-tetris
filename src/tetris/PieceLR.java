
public class PieceLR extends Rotarpieza {
    public PieceLR() {
        super(
            new boolean[][] {
                {false, false, true},
                {true,  true,  true},
                {false, false, false}
            }, // 0°
            new boolean[][] {
                {false, true,  false},
                {false, true,  false},
                {false, true,  true}
            }, // 90°
            new boolean[][] {
                {false, false, false},
                {true,  true,  true},
                {true,  false, false}
            }, // 180°
            new boolean[][] {
                {true,  true,  false},
                {false, true,  false},
                {false, true,  false}
            }  // 270°
        );
    }
}


