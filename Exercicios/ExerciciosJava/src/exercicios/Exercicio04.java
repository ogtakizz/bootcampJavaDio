package exercicios;// Escreva um codigo que receba o nome e a idade de 2 pessoas e imprima a diferenca de idade entre elas

import java.util.Scanner;

public class Exercicio04 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome da primeira pessoa: ");
        String nome1 = sc.nextLine();
        System.out.print("Digite a idade da primeira pessoa: ");
        int idade1 = sc.nextInt();

        System.out.println();
        sc.nextLine(); // Limpar o buffer do scanner

        System.out.print("Digite o nome da segunda pessoa: ");
        String nome2 = sc.nextLine();
        System.out.print("Digite a idade da segunda pessoa: ");
        int idade2 = sc.nextInt();

        if (idade1 >= idade2) {
            System.out.println();
            int diferenca = idade1 - idade2;
            if (diferenca == 1) {
                System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferenca + " ano.");
            } else {
                System.out.println("A diferença de idade entre " + nome1 + " e " + nome2 + " é de " + diferenca + " anos.");
            }
        } else {
            int diferenca = idade2 - idade1;
            System.out.println();
            if (diferenca == 1) {
                System.out.println("A diferença de idade entre " + nome2 + " e " + nome1 + " é de " + diferenca + " ano.");
            } else {
                System.out.println("A diferença de idade entre " + nome2 + " e " + nome1 + " é de " + diferenca + " anos.");
            }
        }

        sc.close();
    }
}
