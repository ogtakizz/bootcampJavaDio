//  Escreva um codigo onde temos uma conta bancaria que possa realizar as seguintes ações:
//  - Consultar saldo;
//  - Cosultar cheque especial
//  - Depositar Dinheiro
//  - Sacar Dinheiro
//  - Pagar um boleto;
//  - Verificar se a conta esta usando cheque especial
//  Siga as seguintes regras para implementar:
//  - A conta deve ter um limite de cheque especial somado ao saldo da conta
//  - O valor do cheque especial é definido no momento da criação da conta
//  - Se o valor depositado na criação da conta for de R$500,00 ou menos, o cheque especial deve ser de R$50,00
//  - Para valores acima de R$500,00 o cheque especial deve ser de 50% do valor depositado
//  - Caso o limite de cheque especial seja usado, assim que possivel, a conta deve cobrar uma taxa de 20% do valor usado do cheque especial

package dominio;

public class Banco {
    private double saldo = 0;
    private double saque;
    private double chequeEspecial;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaque() {
        return saque;
    }

    public void setSaque(double saque) {
        this.saque = saque;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

}
