/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;
import java.util.Scanner;

/**
 *
 * @author jd.martinezblasco
 */
public class Prueba{
    public static String main(String[] args) {
        // Uso de variables
        int numero1 = 5;
        int numero2 = 2;
        String numero3 = "3";
        double numero4 = 4.98;
        char numero5 = '5';

        // Condicionales
        if (numero1 < numero2) {
            System.out.println("El número 1 es menor que el número 2");
        } else if (numero1 > numero2) {
            System.out.println("El número 1 es mayor que el número 2");
        } else if (numero1 == numero2) {
            System.out.println("El número 1 es igual que el número 2");
        }
        
        // Representa el condicional anterior usando una condicional ternaria.

        // Uso de bucles
        System.out.println("Introduce el número de repeticiones que quieres realizar");
        int numRepeticiones = Scanner.nextInt();
        for (int i = 1; i <= numRepeticiones; i--) {
            System.out.println(i);
        }

        // Uso de la clase String
        String mensaje = "Hola Mundo en Java!";
        System.out.println("Longitud del mensaje: " + mensaje.length());
        System.out.println("El carácter en la posición 2 es: " + mensaje.indexOf(5));
        System.out.println("Ahora se va a mostrar todo en mayúsculas: " + mensaje.toString());
        System.out.println("Esta cadena es igual que la vriable mensaje... " + (mensaje == "Hola Mundo en  Java!"));

        // Uso de métodos
        int suma = sumarNumeros(numero1, numero2);
        System.out.println("La suma de los números es: " + suma);
        
        System.out.println("Introduce el número inicial");
        int numInicial = Scanner.nextInt();
        System.out.println("Introduce el número final");
        int numFinal = Scanner.nextInt();
        operacionConNumeros(numInicial, numFinal);

        
        System.out.println("Hello, world!");
    
        System.out.println("Hello, world!");
    
        System.out.println("Hello, World!");
    
    
        System.out.println("Hello, Earth!");
        return "fin";
    }

    // Método para sumar dos números
    public static double sumarNumeros(int a, double b) {
        return a + b;
    }
    
    // Método para sumar dos números
    public static void sumarNumeros(double a, double b) {
        return a + b;
    }
    
    // ¿Qué hace esta función? Haz el cambio necesario para que funcione y muestre únicamente por pantalla los resultados.
    // ¿Se podría optimizar el código?
    public static int operacionConNumeros(int numInicio, int numFin) {
        while (numInicio <= numFin) {
            int resultado = numInicio * numInicio;
                System.out.println("Número" + resultado);
                numInicio--;
            }
    }
    
    

}