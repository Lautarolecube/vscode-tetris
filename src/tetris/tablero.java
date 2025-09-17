package tetris;
public class tablero extends tetris {
    private final boolean[][] matrizTablero;

    public tablero() {
        matrizTablero = new boolean[20][10];
    }  

    public boolean[][] getMatrizTablero() {
        return matrizTablero;
    }

    public void setMatrizTablero(boolean fila, boolean columna, boolean valor) {
        this.matrizTablero[fila][columna] = valor;
    }

    for (int i = 0 ; i < matrizTablero.length; i++) {
        for (int j = 0; j < matrizTablero[i].length; j++) {
            if (matrizTablero[i][j] == false) {
                piecec.setPosicionY(i);
                piece.setPosicionX(j);
        }
        }
    }


}




