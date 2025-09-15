package tetris;
public class tablero {
    private final int[][] matrizTablero;

    public tablero() {
        matrizTablero = new int[20][10];
    }  

    public int[][] getMatrizTablero() {
        return matrizTablero;
    }

    public void setMatrizTablero(int fila, int columna, int valor) {
        this.matrizTablero[fila][columna] = valor;
    }



}
