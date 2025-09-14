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

    // =============================
    // PIEZA L Izquierda (LL)
    // =============================
    @Test
    public void testCreacionPieceLL() {
        PieceLL pieza = new PieceLL();
        boolean[][] esperado = {
            {true, false, false},
            {true, true,  true},
            {false, false, false}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    @Test
    public void testRotacionPieceLL() {
        PieceLL pieza = new PieceLL();
        pieza.rotateRight();
        boolean[][] esperado = {
            {false, true,  true},
            {false, true,  false},
            {false, true,  false}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    // =============================
    // PIEZA L Derecha (LR)
    // =============================
    @Test
    public void testCreacionPieceLR() {
        PieceLR pieza = new PieceLR();
        boolean[][] esperado = {
            {false, false, true},
            {true,  true,  true},
            {false, false, false}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

  @Test
public void testRotacionPieceLR() {
    PieceLR pieza = new PieceLR();
    pieza.rotateRight();

    boolean[][] esperado = {
        {false, true,  false},
        {false, true,  false},
        {false, true,  true}
    };

    assertArrayEquals(esperado, pieza.getShape());
}


    // =============================
    // PIEZA I (Stick)
    // =============================
    @Test
    public void testCreacionPieceStick() {
        PieceStick pieza = new PieceStick();
        boolean[][] esperado = {
            {true, true, true, true}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    @Test
    public void testRotacionPieceStick() {
        PieceStick pieza = new PieceStick();
        pieza.rotateRight();
        boolean[][] esperado = {
            {true},
            {true},
            {true},
            {true}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    // =============================
    // PIEZA T
    // =============================
    @Test
    public void testCreacionPieceT() {
        PieceT pieza = new PieceT();
        boolean[][] esperado = {
            {true, true, true},
            {false, true, false},
            {false, false, false}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    @Test
    public void testRotacionPieceT() {
        PieceT pieza = new PieceT();
        pieza.rotateRight();
        boolean[][] esperado = {
            {false, true, false},
            {true,  true, false},
            {false, true, false}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    // =============================
    // PIEZA O (Square)
    // =============================
    @Test
    public void testCreacionPieceSquare() {
        PieceSquare pieza = new PieceSquare();
        boolean[][] esperado = {
            {true, true},
            {true, true}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    @Test
    public void testRotacionPieceSquare() {
        PieceSquare pieza = new PieceSquare();
        pieza.rotateRight();
        boolean[][] esperado = {
            {true, true},
            {true, true}
        };
        assertArrayEquals(esperado, pieza.getShape(), "El cuadrado no cambia al rotar");
    }

    // =============================
    // PIEZA S (DogL)
    // =============================
    @Test
    public void testCreacionPieceDogL() {
        PieceDogL pieza = new PieceDogL();
        boolean[][] esperado = {
            {false, true,  true},
            {true,  true,  false},
            {false, false, false}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    @Test
    public void testRotacionPieceDogL() {
        PieceDogL pieza = new PieceDogL();
        pieza.rotateRight();
        boolean[][] esperado = {
            {true,  false},
            {true,  true },
            {false, true }
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    // =============================
    // PIEZA Z (DogR)
    // =============================
    @Test
    public void testCreacionPieceDogR() {
        PieceDogR pieza = new PieceDogR();
        boolean[][] esperado = {
            {true,  true,  false},
            {false, true,  true},
            {false, false, false}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }

    @Test
    public void testRotacionPieceDogR() {
        PieceDogR pieza = new PieceDogR();
        pieza.rotateRight();
        boolean[][] esperado = {
            {false, true },
            {true,  true },
            {true,  false}
        };
        assertArrayEquals(esperado, pieza.getShape());
    }
}



