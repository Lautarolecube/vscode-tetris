package main;

public class FormaDogL {

private int[][] formaDogL;

    // Constructor: inicializa la forma
    public FormaDogL() {
        formaDogL = new int[3][3];
        formaDogL[0][1] = 1;
        formaDogL[0][2] = 1;
        formaDogL[1][0] = 1;
        formaDogL[1][1] = 1;
    }

    // Getter: devuelve la matriz
    public int[][] getForma() {
        return formaDogL;
    }

    public void setForma(int[][] nuevaForma) {
        this.formaDogL = nuevaForma;
    }






}
    
