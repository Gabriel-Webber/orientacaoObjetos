package Polimorfismo;

import java.util.Scanner;

public class ScannerRegi extends Registro implements EntradaDados {
    @Override
    public void lerDados() {
        Scanner te = new Scanner(System.in);
        System.out.println("Nome: ");
        this.nome = te.nextLine();

        System.out.println("Saldo: ");
        this.saldo = te.nextDouble();

        System.out.println("Nome: " + this.nome + " saldo: " + this.saldo);
    }
}
