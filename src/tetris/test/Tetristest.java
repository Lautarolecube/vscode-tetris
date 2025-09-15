package tetris.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import tetris.PieceLL;
import tetris.PieceLR;
import tetris.PieceStick;
import tetris.PieceT;
import tetris.PieceSquare;
import tetris.PieceDogL;
import tetris.PieceDogR;


public class Tetristest {

 
    // PIEZA L Izquierda 
   
    @Test
    public void testCreacionPieceLL() {
        PieceLL pieza = new PieceLL();
        int[][] esperado = {
            {1, 0, 0},
            {1, 1,  1},
            {0, 0, 0}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    @Test
    public void testRotacionPieceLL() {
        PieceLL pieza = new PieceLL();
        pieza.rotateRight();
        int[][] esperado = {
            {0, 1,  1},
            {0, 1,  0},
            {0, 1,  0}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    // PIEZA L Derecha 

    @Test
    public void testCreacionPieceLR() {
        PieceLR pieza = new PieceLR();
        int[][] esperado = {
            {0, 0, 1},
            {1,  1,  1},
            {0, 0, 0}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }
    
    @Test
    public void rotarL180() {
        PieceLR pieza = new PieceLR();
        pieza.rotateRight(); // 90°
        pieza.rotateRight(); // 180°
        int[][] esperado = {
            {0, 0, 0},
            {1,  1,  1},
            {1,  0, 0}
        };

        assertArrayEquals(esperado, pieza.getShape());
    }


  @Test
public void testRotacionPieceLR() {
    PieceLR pieza = new PieceLR();
    pieza.rotateRight();

    int[][] esperado = {
        {0, 1,  0},
        {0, 1,  0},
        {0, 1,  1}
    };

    assertArrayEquals(esperado, pieza.getShape());
}



    // PIEZA Stick
   
    @Test
    public void testCreacionPieceStick() {
        PieceStick pieza = new PieceStick();
        int[][] esperado = {
            {1, 1, 1, 1}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    @Test
    public void testRotacionPieceStick() {
        PieceStick pieza = new PieceStick();
        pieza.rotateRight();
        int[][] esperado = {
            {1},
            {1},
            {1},
            {1}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    // PIEZA T

    @Test
    public void testCreacionPieceT() {
        PieceT pieza = new PieceT();
        int[][] esperado = {
            {1, 1, 1},
            {0, 1, 0},
            {0, 0, 0}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    @Test
    public void testRotacionPieceT() {
        PieceT pieza = new PieceT();
        pieza.rotateRight();
        int[][] esperado = {
            {0, 1, 0},
            {1,  1, 0},
            {0, 1, 0}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

   
    // PIEZA Square
 
    @Test
    public void testCreacionPieceSquare() {
        PieceSquare pieza = new PieceSquare();
        int[][] esperado = {
            {1, 1},
            {1, 1}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    @Test
    public void testRotacionPieceSquare() {
        PieceSquare pieza = new PieceSquare();
        pieza.rotateRight();
        int[][] esperado = {
            {1, 1},
            {1, 1}
        };
        assertArrayEquals(esperado, pieza.getShape(), "El cuadrado no cambia al rotar");
    }


    // PIEZA DogL
  
    @Test
    public void testCreacionPieceDogL() {
        PieceDogL pieza = new PieceDogL();
        int[][] esperado = {
            {0, 1,  1},
            {1,  1,  0},
            {0, 0, 0}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    @Test
    public void testRotacionPieceDogL() {
        PieceDogL pieza = new PieceDogL();
        pieza.rotateRight();
        int[][] esperado = {
            {1,  0},
            {1,  1 },
            {0, 1 }
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    
    // PIEZA DogR
    
    @Test
    public void testCreacionPieceDogR() {
        PieceDogR pieza = new PieceDogR();
        int[][] esperado = {
            {1,  1,  0},
            {0, 1,  1},
            {0, 0, 0}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    @Test
    public void testRotacionPieceDogR() {
        PieceDogR pieza = new PieceDogR();
        pieza.rotateRight();
        int[][] esperado = {
            {0, 1 },
            {1,  1 },
            {1,  0}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }


}
    // TABLERO
    











