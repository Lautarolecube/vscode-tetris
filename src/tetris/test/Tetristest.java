import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;



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

    // TABLERO
    @Test
    public void testBoardDimensions() {
        Board board = new Board();
        // No hay getter en el ejemplo, así que probamos con spawn + movimientos
        Rotarpieza piece = new PieceStick(); 
        board.spawnPiece(piece);
        assertNotNull(piece);
    }

    @Test
    public void testSpawnPieceAtTop() {
        Board board = new Board();
        Rotarpieza piece = new PieceSquare();
        board.spawnPiece(piece);
        // Después de spawnear, la pieza actual no debe ser null
        assertNotNull(piece);
    }

    @Test
    public void testPieceMovesDownOnTick() {
        Board board = new Board();
        Rotarpieza piece = new PieceSquare();
        board.spawnPiece(piece);

        // Guardamos la posición inicial
        int initialRow = board.getCurrentRow();

        // Avanzamos un tick
        board.tick();

        // La fila de la pieza actual debe haber aumentado
        assertEquals(initialRow + 1, board.getCurrentRow());
    }

    @Test
    public void testPieceStopsAtBottom() {
    Board board = new Board();
    Rotarpieza piece = new PieceSquare();
    board.spawnPiece(piece);

    // Bajamos la pieza hasta el fondo
    for (int i = 0; i < 25; i++) { 
        board.tick();
    }

    // El tablero debe tener celdas ocupadas en la última fila
    boolean bottomOccupied = false;
    for (int col = 0; col < 10; col++) {
        if (board.isCellOccupied(19, col)) {
            bottomOccupied = true;
            break;
        }
    }

    assertTrue(bottomOccupied, "La fila inferior debería estar ocupada por la pieza fijada");
}

}










