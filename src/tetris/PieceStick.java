package tetris;
public class PieceStick extends Piece {
    public PieceStick() {
        super(
            new int[][] { {1,1,1,1} },                 // 0°  -> 1x4
            new int[][] { {1},{1},{1},{1} },           // 90° -> 4x1
            new int[][] { {1,1,1,1} },                 // 180°
            new int[][] { {1},{1},{1},{1} }            // 270°
        );
    }
}


