/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

/**
 *
 * @author Usuario iTC
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        double resultado = 0;
        String secuencia = "1";
        int signo = -1;
        int dem = 3;
        
        System.out.println("Serie: ");

        while (dem <= 15) {
            if (signo == 1) {
                secuencia = secuencia + " + 1/" + dem;
            } else {
                secuencia = secuencia + " - 1/" + dem;
            }

            resultado = resultado + signo * (1.0 / dem);

            signo = signo * -1;

            dem = dem + 2;
        }

        resultado =  resultado + 1;
        
        System.out.println(secuencia);
        System.out.println("Resultado de la serie: " + resultado);
    }
}