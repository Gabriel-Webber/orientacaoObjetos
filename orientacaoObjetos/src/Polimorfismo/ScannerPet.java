package Polimorfismo;

import java.util.Scanner;

public class ScannerPet extends Pet implements EntradaDados {
    @Override
    public void lerDados() {
        Scanner te = new Scanner(System.in);
        System.out.println("nome: ");
        this.nome = te.nextLine();

        System.out.println("tipo: ");
        this.tipo = te.nextLine();

        System.out.println("Nome: " + this.nome + " Genero: " + this.tipo);
    }
}
