package tetris;
public class Board {
    private final int fils = 20;
    private final int cols = 10;
    private int[][] subMatriz = new int[fils][cols];

    public Rotarpieza currentPiece;
    private int currentFil = 0; // Renombrado de currentRow
    private int currentCol;


    public void moverIzquierdaCol(){
        if (canMove(currentPiece, currentFil, currentCol -1)){
            currentCol--;
        }

     }
 
    public void moverDerechaCol(){
        if (canMove(currentPiece, currentFil, currentCol +1)){
            currentCol++;
        }  
    }

    public void moverAbajo(){
        tick();
    } 
    

    //Recorre la matriz y agregar la pieza en la posicion actual
   public boolean tick() {
    if (currentPiece == null) return false;
        if (canMove(currentPiece, currentFil + 1, currentCol)) {
            currentFil++;
            return false;                // No se fija Pieza
        } else {
            mergePiece();    //-------> SE FIJA PIEZA      
            currentPiece = null;
            return true;     // Se fija Pieza
        }
    }
    
    
     // Verifica si la pieza cabe en una posicion
    private boolean canMove(Rotarpieza piece, int fil, int col) {
        int[][] shape = piece.getShape();
        for (int f = 0; f < shape.length; f++) {
            for (int c = 0; c < shape[0].length; c++) {
                if (shape[f][c] != 0) {
                    int boardFil = fil + f;
                    int boardCol = col + c;

                    // Fuera de limites
                    if (boardFil >= fils || boardCol < 0 || boardCol >= cols) return false; // ---> Por lo que no se puede agregar más pieza

                    // Colision
                    if (subMatriz[boardFil][boardCol] != 0) return false;
                }
            }
        }
        return true;
    }
 
    // Fija la pieza actual en el tablero
    private void mergePiece() {
        int[][] shape = currentPiece.getShape();
        for (int f = 0; f < shape.length; f++) {
            for (int c = 0; c < shape[0].length; c++) {
                if (shape[f][c] != 0) {
                    subMatriz[currentFil + f][currentCol + c] = shape[f][c];
                }
            }
        }
    }

    public int getCurrentFil() { // Renombrado de getCurrentRow
        return currentFil;
    }

    public boolean isCellOccupied(int fil, int col) { // Renombrado de row a fil
        return subMatriz[fil][col] != 0;
    }
}


    

