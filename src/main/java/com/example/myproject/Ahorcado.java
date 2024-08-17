package com.example.myproject;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Ahorcado
{
    public static void main( String[] args ) throws Exception
    {
        /* Permite Escribir al usuario */
        Scanner scanner = new Scanner(System.in);

        /* Declaraciones y asignaciones*/
        String palabraSecreta = "INTELIGENCIA";
        int intentosMax = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        /* Arreglos:*/
        char[] letrasAdivinadas = new char[palabraSecreta.length()];

        /* Estructura de control : Iterativa (Bucle)*/
        for (int i = 0; i < letrasAdivinadas.length; i++){
            letrasAdivinadas[i] = '_';
        }

        /* Estructura de control : Iterativa (Bucle)*/
        while (!palabraAdivinada && intentos < intentosMax) {
                                                        //Esto se usa cuando tenemos una palabra de chars
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas)+ " (" + palabraSecreta.length() + " letras)");
 
            System.out.println("Introduce una letra:");
            /* Proceso que pide una letra y tomara la primera letra ingresada*/
            char letra = Character.toUpperCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;
            for(int i = 0; i < palabraSecreta.length(); i++){
               /* Estructura de control adicional*/
                if (palabraSecreta.charAt(i) == letra) {
                    letrasAdivinadas[i] = letra;
                    letraCorrecta = true;
                }
            }

            if (!letraCorrecta) {
                intentos++;
                System.out.println("¡Incorrecto! Te quedan " + (intentosMax - intentos) + " intentos.");
            }

            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.out.println("¡Felicidades! Has adivinado la palabra secreta: " + palabraSecreta);
            }
        }

        if (!palabraAdivinada) {
           System.out.println("¡Que pena te haz quedado sin intentos! Game Over"); 
        }

        scanner.close();
    }
}
