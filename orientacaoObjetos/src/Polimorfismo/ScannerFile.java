package Polimorfismo;

import java.util.Scanner;

public class ScannerFile extends Fileme implements EntradaDados {
    @Override
    public void lerDados() {
        Scanner te = new Scanner(System.in);
        System.out.println("Titulo: ");
        this.nome = te.nextLine();

        System.out.println("Genero: ");
        this.genero = te.nextLine();

        System.out.println("Nome: " + this.nome + " Genero: " + this.genero);

    }
}
