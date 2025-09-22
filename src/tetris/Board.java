package tetris;

public class Board {
    private final int rows = 20, cols = 10;
    private final int[][] grid = new int[rows][cols]; // 0 = vacío (fijo = id>0 si querés)
    private Rotarpieza currentPiece;
    private int currentRow, currentCol;

    // ====== Spawns ======

    // Spawnea la pieza centrada horizontalmente (si entra). No crea la siguiente: sólo coloca la actual.
    public void spawnPiece(Rotarpieza piece) {
        this.currentPiece = piece;
        this.currentRow = 0;
        int w = piece.getShape()[0].length;
        this.currentCol = Math.max(0, (cols - w) / 2);
        if (!canMove(piece, currentRow, currentCol)) {
            throw new IllegalStateException("Game Over: no hay lugar para spawnear");
        }
    }

    // Útil para tests: spawnear en una columna concreta
    public void spawnPieceAt(Rotarpieza piece, int col) {
        this.currentPiece = piece;
        this.currentRow = 0;
        this.currentCol = col;
        if (!canMove(piece, currentRow, currentCol)) {
            throw new IllegalStateException("Spawn inválido");
        }
    }

    //Ticks
    public boolean tick() {
        if (currentPiece == null) return false; 

        if (canMove(currentPiece, currentRow + 1, currentCol)) {
            currentRow++;              // baja exactamente 1 celda
            return false;              // no se fijó
        } else {
            fixCurrentPiece();         // se pega al tablero
            currentPiece = null;       // ya no hay pieza activa
            return true;               // se fijó
        }
    }

    public void safeTick() {
        try {
            tick();
        } catch (IllegalStateException ignore) {
        }
    }

    // utili para saber si la pieza puede moverse a (row, col) sin chocar ni salirse
    private boolean canMove(Rotarpieza piece, int row, int col) {
        int[][] s = piece.getShape();
        int h = s.length, w = s[0].length;
        for (int r = 0; r < h; r++) {
            for (int c = 0; c < w; c++) {
                if (s[r][c] != 0) {
                    int br = row + r, bc = col + c;
                    if (br < 0 || br >= rows || bc < 0 || bc >= cols) return false; // fuera
                    if (grid[br][bc] != 0) return false;                             // choca
                }
            }
        }
        return true;
    }

    // Pega la pieza actual al tablero
    private void fixCurrentPiece() {
        int[][] s = currentPiece.getShape();
        int h = s.length, w = s[0].length;
        for (int r = 0; r < h; r++) {
            for (int c = 0; c < w; c++) {
                if (s[r][c] != 0) {
                    grid[currentRow + r][currentCol + c] = s[r][c]; // o un ID de pieza/color
                }
            }
        }
    }

    //Eliminar la fila completa

    public boolean clearFullRows() {
        boolean filaEliminada = false;
        for (int r = 0; r < rows; r++) {//En esta linea va a recorerr todas las filas
            boolean full = true; //Se asume que la fila está completa en el caso que full no sea false
            for (int c = 0; c < cols; c++) {
                if (grid[r][c] == 0) {
                    full = false; // Si alguna de las celdas no tiene un valor "1" retorna falsa, por lo tanto no va a ser necesario eliminar la fila
                    break;
                }
            }
            if (full) { //Si es verdadero, ingresa y la siguiente acción es
                // Mover todas las filas superiores hacia abajo
                filaEliminada = true;
                for (int rr = r; rr > 0; rr--) {
                    System.arraycopy(grid[rr - 1], 0, grid[rr], 0, cols); // Desplaza la fila hacia abajo, es decir copia la fila que está encima de la completa en dónde está la fila completa y limpia la fila 0
                }
                // Limpia la fila superior
                for (int c = 0; c < cols; c++) {
                    grid[0][c] = 0; // Va colocando 0 en cada celda de la fila 1
                }
            }
        }
        return filaEliminada;
    }


    // ====== Getters útiles para tests ======

    public int getCurrentRow() { return currentRow; }
    public int getCurrentCol() { return currentCol; }
    public boolean hasActivePiece() { return currentPiece != null; }
    public boolean isCellOccupied(int r, int c) { return grid[r][c] != 0; }
    public int getRows() { return rows; }
    public int getCols() { return cols; }

}
