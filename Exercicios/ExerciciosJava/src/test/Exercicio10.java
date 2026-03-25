package test;

import dominio.Banco;

import java.util.Scanner;

public class Exercicio10 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Banco banco = new Banco();

        do {
            System.out.println("--------------------------");
            System.out.println("Boas Vindas ao Banco!");
            System.out.println("--------------------------");
            System.out.println("Selecione uma opção a seguir para começar:");
            System.out.println("1 - Criar Conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Consultar Saldo");
            System.out.println("4 - Sacar");
            System.out.println("5 - Consultar Cheque Especial");
            System.out.println("6 - Usar Cheque Especial");
            System.out.println("7 - Sair");
            System.out.print("Digite a opção desejada: ");
            int escolhas = sc.nextInt();

            System.out.println("--------------------------");
            if (escolhas == 1) {
                System.out.print("Digite o valor a ser depositado: R$");
                banco.setSaldo(sc.nextDouble());

                System.out.println("--------------------------");
                if (banco.getSaldo() <= 500) {
                    banco.setChequeEspecial(banco.getSaldo() * 0.1);
                } else {
                    banco.setChequeEspecial(banco.getSaldo() * 0.5);
                }
                System.out.printf("Saldo atual: R$%.2f\n", banco.getSaldo());
                System.out.printf("Cheque Especial: R$%.2f\n", banco.getChequeEspecial());
            } else if (escolhas == 2) {
                System.out.print("Digite o valor a ser depositado: R$");
                banco.setSaldo(banco.getSaldo() + sc.nextDouble());
            } else if (escolhas == 3) {
                System.out.printf("Saldo atual: R$%.2f\n", banco.getSaldo() + banco.getChequeEspecial());
            } else if (escolhas == 4) {
                System.out.print("Valor a ser sacado: R$");
                banco.setSaque(sc.nextDouble());
                banco.setSaldo(banco.getSaldo() - banco.getSaque());
            } else if (escolhas == 5) {
                System.out.printf("Cheque Especial: R$%.2f\n", banco.getChequeEspecial());
            } else if (escolhas == 6) {
                System.out.print("Valor a ser sacado do cheque especial: R$");
                banco.setSaque(sc.nextDouble());
                double taxaBanco = banco.getSaque() * 0.2;
                banco.setChequeEspecial(banco.getChequeEspecial() - banco.getSaque());
                banco.setSaldo(banco.getSaldo() - taxaBanco);
            } else if (escolhas == 7) {
                break;
            }else {
                System.out.println("Opção Inválida! Por favor, selecione uma opção válida.");
                continue;
            }
        } while (true);

        System.out.println("Obrigado por usar nosso banco! Volte Sempre!");
        System.out.println("--------------------------");

        sc.close();
    }
}
