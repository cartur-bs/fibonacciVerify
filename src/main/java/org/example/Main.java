package org.example;

import services.FibonacciService;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um número e verifique se pertence à sequência de Fibonacci: ");
        int numero = scanner.nextInt();
        //recebe o retorno da class FibonacciService em boolean e responde dinamicamente
        if (FibonacciService.membroDeFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }
}
