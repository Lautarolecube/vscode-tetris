package tetris;

import java.util.Random;


 
public class Tetris{
    private final Board board = new Board();
    private final Random random = new Random();
    private volatile boolean running = true;


    // Baja una sola fila. Si la pieza se fija, spawnea la siguiente.
    private void safeTick() {
    if (!running) return;
    {
        bool    ean seFijo = board.tick();  
            if (seFijo) {
            spawnNewPiece();            // nueva pieza
            }
    } catch (IllegalStateException gameOver) {
        running = false;
    }
}

       
    public ReturnPiece randomPiece(){
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

    // Spawnear una pieza aleatoria en el tablero
    public void spawnNewPiece(){
        ReturnPiece piece = randomPiece();
        board.spawnPiece(piece);
    }

    


}
