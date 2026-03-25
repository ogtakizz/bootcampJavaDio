package exercicios;//  Criar um algoritmo que leia a entrada de salario e beneficios de uma pessoa
//  e baseado na entrada, ele calcule os impostos sobre o valor bruto do salario + beneficios.
//  No final, printe o valor liquido do salario, ja com os impostos descontados e os beneficios somados

//  Percentual dos impostos baseado no salario:
//  de R$0,00 até R$1100,00 = 5% de imposto
//  de R$1100,00 até R$2500,00 = 10% de imposto
//  mais de R$2500 = 15% de imposto

import java.util.Scanner;

public class Exercicio09 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do salario: R$");
        float valorSalario = sc.nextFloat();
        System.out.print("Digite o valor dos beneficios: R$");
        float valorBeneficios = sc.nextFloat();

        float valorImposto;
        if(valorSalario >= 0 && valorSalario <= 1100) {
            valorImposto = 0.05F * valorSalario;
        } else if (valorSalario >= 1100 && valorSalario <= 2500) {
            valorImposto = 0.1F * valorSalario;
        } else {
            valorImposto = 0.15F * valorSalario;
        }

        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.printf("R$%.2f", saida);

        sc.close();
    }
}
