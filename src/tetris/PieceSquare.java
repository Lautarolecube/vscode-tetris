package tetris;
public class PieceSquare extends Piece {
    public PieceSquare() {
        super(
            new int[][] { {1, 1}, {1, 1} },  // 0°
            new int[][] { {1, 1}, {1, 1} },  // 90°
            new int[][] { {1, 1}, {1, 1} },  // 180°
            new int[][] { {1, 1}, {1, 1} }   // 270°
        );
    }
}
