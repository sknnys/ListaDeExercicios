package diversos;

import java.util.Scanner;

/*1. Par ou Ímpar

Escreva um algoritmo que receba um número e informe se ele é par ou ímpar.
Avalia: uso do operador % e condição if/else. */

public class Verificador {
    public static void main(String[] args) {
        Scanner numero = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int verifica = numero.nextInt();
        
        if(verifica > 0 && verifica % 2 == 0) {
            System.out.println("é par");
        } else {
            System.out.println("é impar");
        }
    }
}
