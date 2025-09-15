package tetris;
public class PieceSquare extends Rotarpieza {
    public PieceSquare() {
        super(
            new boolean[][] { {true, true}, {true, true} },  // 0°
            new boolean[][] { {true, true}, {true, true} },  // 90°
            new boolean[][] { {true, true}, {true, true} },  // 180°
            new boolean[][] { {true, true}, {true, true} }   // 270°
        );
    }
}
