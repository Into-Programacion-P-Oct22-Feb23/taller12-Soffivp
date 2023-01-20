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
public class Problema00 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        double[][] datos = {{10, 2}, {1, 5}, {6, 2}, {7, 8}};
        double numero = 0;
        for (int i = 0; i < datos.length; i++) {
            for (int j = 0; j < datos[i].length; j++) {
                numero = datos[i][j];
                System.out.printf("%.2f\n", factorial(numero));
            }

        }

    }

    public static double factorial(double numero) {
        double[][] resultado = new double[4][2];
        double factor = 0;
        if (numero <= 1) { // aquí se evalua el caso base

            return 1; // 0! = 1 
            // 1! = 1
        } else {

            for (int i = 0; i < resultado.length; i++) {
                for (int j = 0; j < resultado[i].length; j++) {
                    factor = numero * factorial(numero - 1);
                    resultado[i][j] = factor;
                }
            }
            return factor;
        }
    }

}
