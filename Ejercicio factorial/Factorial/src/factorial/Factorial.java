/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author jon
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.print("ingrese el numero que decea factorizar\n");
        int numF = s.nextInt();
        //Resultados 
        System.out.printf("El Facotorial de %d es : %.0f " , numF,factorial(numF));  
    }
 public static double factorial(int n) {
        double aux = 1;
        for (int i = 2; i <= n; i++) {
            aux *= i;
        }
        return aux;
    }
}
