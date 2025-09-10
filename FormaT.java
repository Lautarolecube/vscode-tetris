public class FormaT {
    // Matriz que representa la forma T (3x3)
    private int[][] forma = {
        {0, 1, 0},
        {1, 1, 1},
        {0, 0, 0},

    };

    public FormaT() {
        // Constructor vacío
    }

    public int[][] getForma() {
        return forma;
    }

    // Método para rotar la forma T 90 grados
    public void rotar() {
        int n = forma.length;
        int[][] nuevaForma = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                nuevaForma[j][n - 1 - i] = forma[i][j];
            }
        }
        forma = nuevaForma;
    }

    public void mostrar() {
    for (int i = 0; i < forma.length; i++) {
        for (int j = 0; j < forma[i].length; j++) {
            System.out.print(forma[i][j] == 1 ? "[X]" : "[ ]");
        }
        System.out.println();
    }
}
    // Ejemplo de uso
public static void main(String[] args) {
    FormaT t = new FormaT();
    t.mostrar();
    System.out.println("Rotada:");
    t.rotar();
    t.mostrar();
}
}