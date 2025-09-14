
public class PieceT extends Rotarpieza {
    public PieceT() {
        super(
            new boolean[][] {
                {true, true, true},
                {false, true, false},
                {false, false, false}
            }, // 0°

            new boolean[][] {
                {false, true, false},
                {true,  true, false},
                {false, true, false}
            }, // 90°

            new boolean[][] {
                {false, false, false},
                {false, true, false},
                {true,  true, true}
            }, // 180°

            new boolean[][] {
                {false, true, false},
                {false, true, true},
                {false, true, false}
            }  // 270°
        );
    }
}

