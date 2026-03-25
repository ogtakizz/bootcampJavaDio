package exercicios;// Escreva um codigo onde o usuario entra com um numero e seja gerada a tabuada de 1 ate 10 desse numero

import java.util.Scanner;

public class Exercicio05 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tabuada = 1;

        System.out.print("Digite um numero: ");
        int num =  sc.nextInt();

        do {
            System.out.println(num * tabuada);
            tabuada++;
        }while(tabuada != 11);

        sc.close();
    }
}
