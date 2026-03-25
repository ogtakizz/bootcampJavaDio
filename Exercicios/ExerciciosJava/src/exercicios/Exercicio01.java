package exercicios;//  Escreva um codigo que receba o nome e o ano de nascimento de alguem e imrpima na tela a seguinte mensagem:
//  "Ola 'Fulano' Voce tem 'X' anos"

import java.util.Scanner;

public class Exercicio01 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu ano de nascimento: ");
        int idade = 2026 - sc.nextInt();

        System.out.println("Ola, "+nome+"! voce tem "+ idade +" anos!");

        sc.close();
    }
}
