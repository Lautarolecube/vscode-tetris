package tetris;
public abstract class Rotarpieza {

    private final int[][][] rotations; // [4][filas][cols]
    private int orientation = 0;       // 0..3

    public Rotarpieza(int[][] r0, int[][] r90, int[][] r180, int[][] r270) {
        this.rotations = new int[][][] {
            copy(r0), copy(r90), copy(r180), copy(r270)
        };
    }

    public int[][] getShape() {
        return copy(rotations[orientation]); // copia defensiva
    }

    public void rotateRight() { // 0→90→180→270→0
        orientation = (orientation + 1) & 3;
    }

    public void rotateLeft() {  // 0→270→180→90→0
        orientation = (orientation + 3) & 3;
    }

    public int getOrientation() { return orientation; }

    private static int[][] copy(int[][] m) {
        int rows = m.length, cols = m[0].length;
        int[][] c = new int[rows][cols];
        for (int r = 0; r < rows; r++) System.arraycopy(m[r], 0, c[r], 0, cols);
        return c;
    }
}


