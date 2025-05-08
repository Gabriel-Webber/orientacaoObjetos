package Polimorfismo;

import java.util.Scanner;

public class ScannerCurso extends Curso implements EntradaDados {
    @Override
    public void lerDados() {
        Scanner te = new Scanner(System.in);
        System.out.println("Curso: ");
        this.curso = te.nextLine();

        System.out.println("Duração: ");
        this.duracao = te.nextInt();

        System.out.println("Curso: " + this.curso + " Duração: " + this.duracao);
    }
}
