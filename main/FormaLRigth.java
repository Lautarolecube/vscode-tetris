package main;

public class FormaLRigth {

    private int[][] formaLright;

    //inicializa la forma
    public FormaLRigth() {
        formaLright = new int[3][3];
        formaLright[0][2] = 1;
        formaLright[1][2] = 1;
        formaLright[2][1] = 1;
        formaLright[2][2] = 1;
    }

    //devuelve la matriz
    public int[][] getForma() {
        return formaLright;
    }
}

