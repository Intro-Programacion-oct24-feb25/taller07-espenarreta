/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Usuario iTC
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String nombre;
        String posicion;
        int edad;
        double estatura;
        String cadena = "";
        int contador = 0;
        boolean bandera = true;
        String salida;
        int listado_edades = 0;
        double estatura_final = 0;
        double promedio_A;
        double promedio_E;
        String cadena_edades = "";

        while (bandera) {
            System.out.println("Ingrese el nombre del jugador:");
            nombre = entrada.nextLine();
            System.out.println("Ingrese la poscion del jugador:");
            posicion = entrada.nextLine();
            System.out.println("Ingrese la edad del jugador:");
            edad = entrada.nextInt();
            System.out.println("Ingrese la altura del jugador:");
            estatura = entrada.nextDouble();

            contador = contador + 1;

            cadena = String.format("%s%d. %s -%s-, edad %d, estatura %.2f\n",
                    cadena,
                    contador,
                    nombre,
                    posicion,
                    edad,
                    estatura);
            
            listado_edades = listado_edades + edad;
            estatura_final = estatura_final + estatura;
            entrada.nextLine();

            System.out.println("Ingrese 'si' si desea continuar, e ingrese 'no'"
                    + "para salir: \n");
            salida = entrada.nextLine();
            
            cadena_edades = String.format("%s\n%d",cadena_edades, edad);

            if (salida.equals("no")) {
                bandera = false;
            }

        }

        promedio_E = listado_edades / contador;
        promedio_A = estatura_final / contador;

        System.out.printf("Listado de Jugadores\n%s\nListado de edades: "
                + "%s\nPromedio de edades: %.1f\nPromedio de estaturas: %.2f\n",
                cadena, cadena_edades, promedio_E, promedio_A);
    }
}
