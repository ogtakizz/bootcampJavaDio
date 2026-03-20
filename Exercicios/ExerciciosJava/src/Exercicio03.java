//  Escreva um codigo que receba a base e a altura de um retangulo, calcule sua area e exiba na tela
//  formula: area = base x altura

import java.util.Random;

public class Exercicio03 {
    static void main(String[] args) {
        Random rand = new Random();

        int base = rand.nextInt(50);
        int altura = rand.nextInt(50);
        int area = base * altura;

        System.out.println("O base do retangulo é "+base+"cm e a altura é "+altura+"cm. Logo, sua área é "+area+"cm.");
    }
}
