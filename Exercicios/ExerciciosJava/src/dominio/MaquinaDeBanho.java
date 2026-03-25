package dominio;

public class MaquinaDeBanho {
    private double agua = 0;
    private double shampoo = 0;
    final double limiteAgua = 30;
    final double limiteShampoo = 10;
    private boolean isClean = true;
    private boolean hasPet = false;

    public MaquinaDeBanho() {
    }

    public MaquinaDeBanho(double agua, double shampoo) {
        this.agua = agua;
        this.shampoo = shampoo;
    }

    public void setHasPet(boolean hasPet) {
        this.hasPet = hasPet;
    }

    public boolean getHasPet() {
        return hasPet;
    }

    public void setAgua(double quantidade) {
        if (getAgua() + quantidade > limiteAgua) {
            System.out.println("Não foi possível adicionar a água, pois o limite é de " + limiteAgua + " litros!");
            return;
        }

        this.agua += quantidade;
    }

    public double getAgua() {
        return this.agua;
    }

    public void setShampoo(double quantidade) {
        if (getShampoo() + quantidade > limiteShampoo) {
            System.out.println("Não foi possível adicionar o shampoo, pois o limite é de " + limiteShampoo + " litros!");
            return;
        }

        this.shampoo += quantidade;
    }

    public double getShampoo() {
        return this.shampoo;
    }

    public void setClean(boolean isClean) {
        this.isClean = isClean;
    }

    public boolean getClean() {
        return isClean;
    }

    public void botarPetMaquina() {
        if (!hasPet) {
            if (isClean) {
                setHasPet(true);
                System.out.println("Pet colocado com sucesso!");
            } else {
                System.out.println("Maquina Suja! Limpe-a antes de dar banho em outro Pet!");
            }
        } else {
            System.out.println("Já tem um pet dentro da máquina! Termine de dar banho nele antes!");
        }
    }

    public void tirarPetMaquina() {
        if (hasPet) {
            setHasPet(false);
            setClean(false);
            System.out.println("Pet retirado com sucesso!");
        } else {
            System.out.println("Nenhum Pet dentro da Máquina! Por favor, coloque um Pet para dar banho.");
        }
    }

    public void darBanho() {
        if (hasPet) {
            if (agua < 10 && shampoo < 2 || agua > 10 && shampoo < 2 || agua < 10 && shampoo > 2) {
                System.out.println("Sem água e shampoo suficientes! Por favor reabasteça a máquina.");
            } else if (!isClean) {
                System.out.println("Máquina suja! Por favor, limpe a máquina antes de dar banho no pet.");
            } else {
                agua -= 10;
                shampoo -= 2;
                isClean = false;
            }
        } else {
            System.out.println("Nenhum Pet dentro da máquina! Por favor, coloque um Pet para dar banho.");
        }

    }

    public void checarMaquina() {
        System.out.println("Status da Máquina de Banho");
        System.out.println("Água: " + agua + " litros");
        System.out.println("Shampoo: " + shampoo + " litros");
        System.out.println("Pet dentro da máquina: " + (getHasPet() ? "Sim" : "Não"));
        System.out.println("Máquina limpa: " + (getClean() ? "Sim" : "Não"));
    }

    public void limparMaquina() {
        if (!isClean) {
            if (hasPet) {
                System.out.println("Por favor retire o pet antes de realizar a limpeza da maquina!");
            } else if (getAgua() < 3 && getShampoo() < 1) {
                System.out.println("Sem Agua e Shampoo suficientes para a limpeza! Por favor, reabasteça a máquina.");
            } else {
                setClean(true);
                setAgua(-3);
                setShampoo(-1);
                System.out.println("Máquina de banho limpa com sucesso!");
            }
        } else {
            System.out.println("Máquina de Banho já está limpa! Pode voltar a utiliza-la.");
        }
    }

}
