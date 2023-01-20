/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author reroes
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[][] datos1 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[][] datos2 = {{10, 2, 3}, {1, 5, 8}, {6, 2, 3}, {7, 8, 1}};
        double[][] datos3 = new double[4][3];
        double valor1 = 0; // 3 // 6
        double valor2 = 0; // 5 // 1
        for (int i = 0; i < datos1.length; i++) {
            for (int j = 0; j < datos1[i].length; j++) {
                valor1 = datos1[i][j];
                valor2 = datos2[i][j];
                datos3[i][j] = obtenerSuma(valor1, valor2);
                
            }
        }
        for (int i = 0; i < datos1.length; i++) {
            for (int j = 0; j < datos1[i].length; j++) {
               
                System.out.println(datos3[i][j]);
            }
        }

    }

    public static double obtenerSuma(double a, double b) {

        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {
                return 1 + obtenerSuma(a, b - 1);
            }
        }
    }

}
