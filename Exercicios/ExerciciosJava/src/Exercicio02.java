//  Escreva um codigo que receba o tamanho do lado de um quadrado, calcule sua area e exiba na tela
//  formula: area = lado x lado

import java.util.Random;

public class Exercicio02 {
    static void main(String[] args) {
        Random rand = new Random();

        int lado = rand.nextInt(10);
        int area = lado * lado;

        System.out.println("O altura do quadrado é "+lado+"cm. Logo, sua área é "+area+"cm.");

    }
}
