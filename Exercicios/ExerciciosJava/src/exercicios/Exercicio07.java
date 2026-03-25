package exercicios;//  Escreva um codigo que o usuario entre com um primeiro numero, um segundo numero maior que o primeiro, e escolha entre a opcao par e impar.
//  Com isso, o codigo deve informar todos os numeros pares ou impares (de acordo com a escolha do usuario) no intervalo de numeros informados.
//  Incluindo os numeros informados, e em ordem decrescente.

import java.util.Scanner;

public class Exercicio07 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num1;
        int num2;
        int opcao;

        System.out.print("Digite um numero: ");
        num1 = sc.nextInt();

        System.out.print("Digite um numero maior que o anterior: ");
        num2 = sc.nextInt();

        if (num2 <= num1) {
            System.out.println("Intervalo invalido! O segundo numero deve ser maior que o primeiro.");
            sc.close();
            return;
        }

        System.out.println();
        System.out.print("Escolha uma opcao: \n1 - Mostrar os numeros pares\n2 - Mostrar os numeros impares\nDigite sua escolha: ");
        opcao = sc.nextInt();

        System.out.println("--------------------------------");

        switch (opcao) {
            case 1:
                for (int i = num2; i >= num1; i--) {
                    if (i % 2 == 0) {
                        System.out.println(i+" ");
                    }
                }
                break;
            case 2:
                for (int i = num2; i >= num1; i--) {
                    if (i % 2 != 0) {
                        System.out.print(i+" ");
                    }
                }
                break;
            default:
                System.out.println("Opcao invalida!");
                break;
        }

        sc.close();
    }
}
