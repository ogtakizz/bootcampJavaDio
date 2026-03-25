package exercicios;//  Escreva um codigo onde o usuario informa um numero inicial, e posteriormente ira informar outros N numeros.
//  A execucao do codigo ira continuar ate que o numero informado seja dividido pelo primeiro numero tenha resto
//  diferente de zero no resto da divisao. Numero menores que o numero inicial devem ser ignorados;

import java.util.Scanner;

public class Exercicio08 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um numero: ");
        var number = sc.nextInt();
        var keepVerify = true;

        while (keepVerify) {
            System.out.print("Informe um numero para verificação: ");
            var toVerify = sc.nextInt();

            if (toVerify < number) {
                System.out.printf("Informe um numero maior que %s\n ", number);
                continue;
            }

            var result = toVerify % number;
            keepVerify = result == 0;
            System.out.printf("%s %% %s = %s\n", toVerify, number, result);
        }

        sc.close();
    }
}
