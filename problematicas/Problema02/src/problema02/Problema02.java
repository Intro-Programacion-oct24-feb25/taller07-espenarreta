/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

/**
 *
 * @author Usuario iTC
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num= 2;
        int incremento = 4;
        int limite = 10;
        int contador = 1;

        System.out.println("Serie numerica:");
        while (contador <= limite) {

            System.out.println(num);

            num= num + incremento;

            incremento = incremento +2;

            contador = contador + 1;
        }
    }
}
