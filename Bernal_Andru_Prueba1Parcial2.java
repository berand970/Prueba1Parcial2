/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bernal_andru_prueba1parcial2;

import java.util.Random;
import java.util.Scanner;

public class Bernal_Andru_Prueba1Parcial2 {

    public static void main(String[] args) {
        int op = 1, numrand = 0, caracteres = 0;
        Random rand = new Random();
        String pal, reves;
        char letra;
        Scanner leer = new Scanner(System.in);
        String[] palabras = {"radar", "level", "world", "civic", "java", "deified", "python", "rotor", "language", "madam", "refer", "stats", "noon", "hello", "moon", "wow", "racecar", "kayak", "apple", "deed"};

        for (int impresion = 0; impresion < palabras.length; impresion++) {
            System.out.println("[" + impresion + "] " + palabras[impresion]);
        }
      while(true){
        System.out.println("Cuantas palabras desea usar en los arreglos, (1-20):");
        op = leer.nextInt();
        if(op>0 && op<=20){
            break;
        }
      }
        String[] arreglo1 = new String[op];
        String[] arreglo2 = new String[op];

       
        for (int i = 0; i < op; i++) {
            reves = ""; 
            numrand = rand.nextInt(palabras.length);
            pal = palabras[numrand];
            caracteres = pal.length();

            for (int comparacion = caracteres; comparacion > 0; comparacion--) {
                letra = pal.charAt(comparacion - 1);
                reves = reves + letra;
            }

            if (pal.equalsIgnoreCase(reves)) {
                arreglo1[i] = pal;
            } else {
                i--;  
            }
        }

        
        for (int i = 0; i < op; i++) {
            reves = "";  
            numrand = rand.nextInt(palabras.length);
            pal = palabras[numrand];
            caracteres = pal.length();

            for (int comparacion = caracteres; comparacion > 0; comparacion--) {
                letra = pal.charAt(comparacion - 1);
                reves = reves + letra;
            }

            if (pal.equalsIgnoreCase(reves)) {
                arreglo2[i] = pal;
            } else {
                i--;  
            }
        }

        System.out.println("Lista de Palabras Palíndromas arreglo A");
        for (int impresion = 0; impresion < op; impresion++) {
            System.out.println("[" + impresion + "] " + arreglo1[impresion]);
        }

        System.out.println("Lista de Palabras Palíndromas arreglo B");
        for (int impresion = 0; impresion < op; impresion++) {
            System.out.println("[" + impresion + "] " + arreglo2[impresion]);
        }
        
        System.out.println("Palabras del Arreglo A no están en el Arreglo B son:");
        for (int impresion = 0; impresion < op; impresion++) {
            for(int b=0;b<op;b++){
            if(arreglo1[impresion].equalsIgnoreCase(arreglo2[b])){
            System.out.println("[" + impresion + "] " + arreglo1[impresion]);
            }
            }
        }
        
  }
}

