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
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double[] datos = {100, 90, 80, 70, 60};
        double[] datos2 = {200, 190, 180, 170, 160};
        double[] suma = new double[5];

        double valor1 = 0; // 3 // 6
        double valor2 = 0; // 5 // 1
        for (int i = 0; i < datos.length; i++) {
            valor1 = datos[i];
            valor2 = datos2[i];
            suma[i] = obtenerSumas(valor1, valor2);

        }
        for (int i = 0; i < suma.length; i++) {
            System.out.println(suma[i]);
        }
    }

    public static double obtenerSumas(double a, double b) {
        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {
                return 1 + obtenerSumas(a, b - 1);
            }
        }
    }

}
