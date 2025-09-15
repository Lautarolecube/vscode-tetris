public class Board {
    private final int rows = 20;
    private final int cols = 10;
    private int[][] grid = new int[rows][cols];

    private Rotarpieza currentPiece;
    private int currentRow = 0;
    private int currentCol;

    // Crear una nueva pieza arriba en posición aleatoria
    public void spawnPiece(Rotarpieza piece) {
        this.currentPiece = piece;
        this.currentRow = 0;
        this.currentCol = (int)(Math.random() * (cols - piece.getShape()[0].length));
    }

    // Avanzar un tick: mover pieza hacia abajo si cabe
    public void tick() {
        if (canMove(currentPiece, currentRow + 1, currentCol)) {
            currentRow++;
        } else {
            mergePiece();      // fijar la pieza en el tablero
            spawnPiece(randomPiece()); // generar una nueva
        }
    }

    // Verifica si la pieza cabe en una posición
    private boolean canMove(Rotarpieza piece, int row, int col) {
        int[][] shape = piece.getShape();
        for (int r = 0; r < shape.length; r++) {
            for (int c = 0; c < shape[0].length; c++) {
                if (shape[r][c] != 0) {
                    int boardRow = row + r;
                    int boardCol = col + c;
                    // Fuera de límites
                    if (boardRow >= rows || boardCol < 0 || boardCol >= cols) return false;
                    // Colisión
                    if (grid[boardRow][boardCol] != 0) return false;
                }
            }
        }
        return true;
    }

    // Fija la pieza actual en el tablero
    private void mergePiece() {
        int[][] shape = currentPiece.getShape();
        for (int r = 0; r < shape.length; r++) {
            for (int c = 0; c < shape[0].length; c++) {
                if (shape[r][c] != 0) {
                    grid[currentRow + r][currentCol + c] = shape[r][c];
                }
            }
        }
    }

    public int getCurrentRow() {
        return currentRow;
    }

    public boolean isCellOccupied(int row, int col) {
        return grid[row][col] != 0;
    }

    // Ejemplo: generar una pieza aleatoria (L, T, etc.)
    private Rotarpieza randomPiece() {
        return new PieceStick(); 
    }
}

