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
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*double[] bases = {100, 90, 80, 70, 60};
double[] potencias = {2, 3, 2, 2, 1};
Encuentre la potencia de las posiciones 0 de datos(base) y datos2(potencia) , use un método recursivo; y el valor de la potencia, asignarle a un arreglo llamado resultado

         */
        double[] bases = {100, 90, 80, 70, 60};
        double[] potencias = {2, 3, 2, 2, 1};
        double[] resultado = new double[5];
        double base;
        double exponente;
        for (int i = 0; i < bases.length; i++) {
            base = bases[i];
            exponente = potencias[i];
            resultado[i] = obtenerPotencia(base, exponente);

        }
        for (int i = 0; i < resultado.length; i++) {
            System.out.println(resultado[i]);
        }
    }

    public static double obtenerPotencia(double base, double exponente) {

        if (exponente == 1) {
            return base;
        } else {

            return base * obtenerPotencia(base, exponente - 1);
        }
    }
}
