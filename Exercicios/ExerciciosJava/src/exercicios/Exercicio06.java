package exercicios;//  Escreva um codigo onde o usuario entra com sua altura e peso, seja feito o calculo do seu IMC(IMC = peso/(altura*altura)) e seja exibida a mensagem
//  de acordo com o resultado

import java.util.Scanner;

public class Exercicio06 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura;
        double peso;
        double imc;

        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();

        System.out.print("Digite seu peso: ");
        peso = sc.nextDouble();

        imc = peso/(altura*altura);

        if (imc <= 18.5) {
            System.out.println("Abaixo do peso");
        } else if(imc > 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if(imc > 24.9 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        } else if(imc > 29.9 && imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if(imc > 34.9 && imc <= 39.9) {
            System.out.println("Obesidade grau II");
        } else {
            System.out.println("Obesidade grau III");
        }

        sc.close();
    }
}
