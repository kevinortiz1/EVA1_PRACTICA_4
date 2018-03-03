/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Ortiz
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double Matriz1[][] = new double[5][5];
        for (int i = 0; i < Matriz1.length; i++) {
            for (int j = 0; j < Matriz1[i].length; j++) {
                Matriz1[i][j] = (double) (Math.random() * 10) + 1;
            }
        }
        //IMPRIMIR EL ARREGLO
        System.out.println("ARREGLO 1");
        for (int i = 0; i < Matriz1.length; i++) {
            for (int j = 0; j < Matriz1[i].length; j++) {
                System.out.print("[" + Matriz1[i][j] + "]");
            }
            //SALTO DE LINEA 
            System.out.println("");
        }
        double Matriz2[][] = new double[5][5];
        for (int i = 0; i < Matriz2.length; i++) {
            for (int j = 0; j < Matriz2[i].length; j++) {
                Matriz2[i][j] = (double) (Math.random() * 10) + 1;
            }
        }
        //IMPRIMIR EL ARREGLO 2
        System.out.println("ARREGLO 2");
        for (int i = 0; i < Matriz2.length; i++) {
            for (int j = 0; j < Matriz2[i].length; j++) {
                System.out.print("[" + Matriz2[i][j] + "]");
            }
            //SALTO DE LINEA 
            System.out.println("");
        }
        double MatrizMulti[][] = new double[5][5];
        for (int i = 0; i < MatrizMulti.length; i++) {
            for (int j = 0; j < MatrizMulti[i].length; j++) {
                MatrizMulti[i][j] = Matriz1[i][j] * Matriz2[i][j];
            }
        }
        //IMPRIMIR EL ARREGLO MULTI
        System.out.println("ARREGLO MULTIPLICACIÓN");
        for (int i = 0; i < MatrizMulti.length; i++) 
        {
            for (int j = 0; j < MatrizMulti[i].length; j++) {
                System.out.print("[" + MatrizMulti[i][j] + "]");
            }
            //SALTO DE LINEA 
            System.out.println("");
        }
    }

}
