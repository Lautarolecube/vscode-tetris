package tetris;


import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;


public class Tetris {
    private final Board board = new Board();
    private final Random rng = new Random();
    private final LinkedBlockingQueue<String> input = new LinkedBlockingQueue<>();
    private volatile boolean running = true;

    // ms entre "caídas" automáticas (gravedad)
    private long gravityMs = 200;




    // baja la pieza hasta el fondo y spawnea nueva
    private void safeDownPiece() {
        if (!running) return;
        try {
            board.downPiece(); // baja al fondo y fija
            spawnNewPiece();   // nueva pieza
        } catch (IllegalStateException gameOver) {
            running = false;
        }
    }
     // Piezas aleatorias
    private Rotarpieza randomPiece() {
    switch (rng.nextInt(7)) {
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
    // spawnea una pieza aleatoria en el tablero
    private void spawnNewPiece() {
        Rotarpieza p = randomPiece();
        board.spawnPiece(p); 
    }
}


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
