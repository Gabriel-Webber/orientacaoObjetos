package Avaliacao;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Classes sf = new Classes();

        System.out.println("nome");
        sf.nome = teclado.nextLine();


        System.out.println("matricula");
        sf.matricula = teclado.nextLine();

        System.out.println("Curso");
        sf.curso = teclado.nextLine();

        System.out.println("nome: " + sf.nome + " matricula " + sf.matricula + " curso: " + sf.curso);

    }
}
