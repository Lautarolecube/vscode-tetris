// ReturnPiece.java

package tetris;

import java.util.Random;

public  class ReturnPiece {

    public static Piece randomPiece(){
        Random random = new Random();
        switch (random.nextInt(7)){
        case 0: return new PieceT();
        case 1: return new PieceSquare();
        case 2: return new PieceStick();
        case 3: return new PieceLR();
        case 4: return new PieceLL();
        case 5: return new PieceDogL();
        case 6: return new PieceDogR();
        default: return new PieceT();
        }
    }
    
}
