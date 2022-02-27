/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author jon
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        
        int sucesion= 0;
        int nuevoN=1;
        int suma =0;
        int i= 0;
        System.out.println("Sucesion fibonacci con ciclo while");
        while (i<20) {
            if(i<20) {
                System.out.print(sucesion+",");
                suma=sucesion+nuevoN;
                sucesion=nuevoN;
                nuevoN=suma;
           }else{
               System.out.print(sucesion+"");
                suma=sucesion+nuevoN;
                sucesion=nuevoN; 
                  nuevoN=suma;
            }
            i++;
        }
        System.out.println("");
    }
    
}
