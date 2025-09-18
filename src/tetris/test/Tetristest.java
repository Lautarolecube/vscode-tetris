package tetris.test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import tetris.PieceLL;
import tetris.PieceLR;
import tetris.PieceStick;
import tetris.PieceT;
import tetris.PieceSquare;
import tetris.Board;
import tetris.PieceDogL;
import tetris.PieceDogR;


public class Tetristest {

    // compara fila x fila dos matrices para ver si son iguales
    private static void assertMatrixEquals(int[][] expected, int[][] actual) {
        assertEquals(expected.length, actual.length, "Filas distintas");
        for (int i = 0; i < expected.length; i++) {
            assertArrayEquals(expected[i], actual[i], "Fila " + i + " distinta");
        }
    }
 
    // PIEZA L Izquierda 
   
    @Test
    public void testCreacionPieceLL() {
        PieceLL pieza = new PieceLL();
        int[][] esperado = {
            {1, 0, 0},
            {1, 1,  1},
            {0, 0, 0}
        };
    assertMatrixEquals(esperado, pieza.getShape());

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
        assertMatrixEquals(esperado, pieza.getShape());
    }

    @Test
    public void testCreacionPieceLR() {
        PieceLR pieza = new PieceLR();
        int[][] esperado = {
            {0, 0, 1},
            {1,  1,  1},
            {0, 0, 0}
        };
        assertMatrixEquals(esperado, pieza.getShape());
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
        assertMatrixEquals(esperado, pieza.getShape());
    }

    @Test
    public void testCreacionPieceStick() {
        PieceStick pieza = new PieceStick();
        int[][] esperado = {
            {1, 1, 1, 1}
        };
        assertMatrixEquals(esperado, pieza.getShape());
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
        int[][] actual = pieza.getShape();
    assertMatrixEquals(esperado, actual);

    }

    @Test
    public void testCreacionPieceT() {
        PieceT pieza = new PieceT();
        int[][] esperado = {
            {0, 1, 0},
            {1, 1, 1},
            {0, 0, 0}
        };
        assertMatrixEquals(esperado, pieza.getShape());
    }

    @Test
    public void testRotacionPieceT() {
        PieceT pieza = new PieceT();
        pieza.rotateRight();
        pieza.rotateRight();
        pieza.rotateRight();
        int[][] esperado = {
            {0, 1, 0},
            {1,  1, 0},
            {0, 1, 0}
        };
        assertMatrixEquals(esperado, pieza.getShape());
    }

    @Test
    public void testCreacionPieceSquare() {
        PieceSquare pieza = new PieceSquare();
        int[][] esperado = {
            {1, 1},
            {1, 1}
        };
        assertMatrixEquals(esperado, pieza.getShape());
    }

    @Test
    public void testRotacionPieceSquare() {
        PieceSquare pieza = new PieceSquare();
        pieza.rotateRight();
        int[][] esperado = {
            {1, 1},
            {1, 1}
        };
        assertMatrixEquals(esperado, pieza.getShape());
    }

    @Test
    public void testCreacionPieceDogL() {
        PieceDogL pieza = new PieceDogL();
        int[][] esperado = {
            {0, 1,  1},
            {1,  1,  0},
            {0, 0, 0}
        };
        assertMatrixEquals(esperado, pieza.getShape());
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
        assertMatrixEquals(esperado, pieza.getShape());
    }

    @Test
    public void testCreacionPieceDogR() {
        PieceDogR pieza = new PieceDogR();
        int[][] esperado = {
            {1,  1,  0},
            {0, 1,  1},
            {0, 0, 0}
        };
        assertMatrixEquals(esperado, pieza.getShape());
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
        assertMatrixEquals(esperado, pieza.getShape());
    }
    // llegar al fondo del tablero
    @Test
    void piezaLlegaAlFondo() {
        Board board = new Board();
        board.spawnPiece(new PieceSquare());
        // Bajamos la pieza hasta que no pueda bajar más 
        boolean piezaFijada = false;
        for (int i = 0; i < 40; i++) {     // límite grande por seguridad
            if (board.tick()) {             // intenta bajar 1 celda si no puede, la fija
                piezaFijada = true;              // se pone true si se fijó
                break;
            }
        
        }
    }
    
    // llegar al fondo con otra pieza
    @Test
    void piezaLLegarALfondo2(){
        Board board = new Board();
        board.spawnPiece(new PieceLL());
        boolean piezaFijada = false;
        for (int i = 0 ; i < 40; i++){
            if (board.tick()){
                piezaFijada = true;
                break;
            }
        }
    }

// TABLERO
} 











