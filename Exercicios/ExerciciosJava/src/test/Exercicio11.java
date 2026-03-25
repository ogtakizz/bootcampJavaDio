package test;

import dominio.MaquinaDeBanho;

import java.util.Scanner;

public class Exercicio11 {
    static void main(String[] args) {
        MaquinaDeBanho maquina = new MaquinaDeBanho(25, 2);

        Scanner sc = new Scanner(System.in);
        int escolha;

        do {
            escolhas();
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    System.out.println("##################");
                    maquina.botarPetMaquina();
                    System.out.println("##################");
                    continue;
                case 2:
                    System.out.println("##################");
                    maquina.tirarPetMaquina();
                    System.out.println("##################");
                    continue;
                case 3:
                    System.out.println("##################");
                    maquina.darBanho();
                    System.out.println("##################");
                    continue;
                case 4:
                    System.out.println("##################");
                    System.out.println(maquina.getHasPet() ? "Tem um pet no banho!" : "Não tem nenhum pet no banho!");
                    System.out.println("##################");
                    continue;
                case 5:
                    System.out.println("##################");
                    System.out.println("Agua: " + maquina.getAgua() + "L");
                    System.out.println("##################");
                    continue;
                case 6:
                    System.out.println("##################");
                    System.out.println("Shampoo: " + maquina.getShampoo() + "L");
                    System.out.println("##################");
                    continue;
                case 7:
                    System.out.println("##################");

                    System.out.print("Insira quantos litros de água serão abastecidos: ");
                    maquina.setAgua(sc.nextDouble());

                    System.out.println("Agua: " + maquina.getAgua() + "L");
                    System.out.println("##################");
                    continue;
                case 8:
                    System.out.println("##################");

                    System.out.print("Insira quantos litros de shampoo serão abastecidos: ");
                    maquina.setShampoo(sc.nextDouble());

                    System.out.println("Shampoo: " + maquina.getShampoo() + "L");
                    System.out.println("##################");
                    continue;
                case 9:
                    System.out.println("##################");
                    maquina.limparMaquina();
                    System.out.println("##################");
                    continue;
                case 10:
                    System.out.println("##################");
                    maquina.checarMaquina();
                    System.out.println("##################");
                    continue;
                case 11:
                    System.out.println("##################");
                    System.out.println("Desligando Máquina...");
                    break;
                default:
                    System.out.println("Opção inválida! Por favor, escolha uma opção válida.");
                    return;
            }

        } while (escolha != 11);

        System.out.println();
        System.out.println("Maquina Desligada!");

        sc.close();
    }

    public static void escolhas() {
        System.out.println("1 - Colocar Pet na Máquina");
        System.out.println("2 - Retirar Pet da Máquina");
        System.out.println("3 - Dar banho no Pet");
        System.out.println("4 - Verificar se tem Pet no banho");
        System.out.println("5 - Verificar Água");
        System.out.println("6 - Verificar Shampoo");
        System.out.println("7 - Abastecer com Água");
        System.out.println("8 - Abastecer com Shampoo");
        System.out.println("9 - Limpar Máquina");
        System.out.println("10 - Verificar status completos da Maquina");
        System.out.println("11 - Desligar Maquina");
        System.out.print("Opção escolhida: ");
    }
}
