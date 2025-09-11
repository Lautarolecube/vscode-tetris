
public final class Rotarpieza {
    private final boolean[][][] rotations; // [4][filas][cols]
    private int orientation = 0;           // 0..3

    public Rotarpieza(boolean[][] r0, boolean[][] r90, boolean[][] r180, boolean[][] r270) {
        this.rotations = new boolean[][][] {
            copy(r0), copy(r90), copy(r180), copy(r270)
        };
    }

    public boolean[][] getShape() {
        return copy(rotations[orientation]); // copia para evitar mutaciones externas
    }

    public void rotateRight() { // 0°→90°→180°→270°→0°
        orientation = (orientation + 1) & 3;
    }

    public void rotateLeft() {  // 0° 270° 180° 90° 0°
        orientation = (orientation + 3) & 3;
    }

    public int getOrientation() { return orientation; }

    private static boolean[][] copy(boolean[][] m) {
        int rows = m.length, cols = m[0].length;
        boolean[][] c = new boolean[rows][cols];
        for (int r = 0; r < rows; r++) System.arraycopy(m[r], 0, c[r], 0, cols);
        return c;
    }
}
