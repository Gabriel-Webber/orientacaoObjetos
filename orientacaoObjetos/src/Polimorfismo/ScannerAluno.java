package Polimorfismo;

import java.util.Scanner;

public class ScannerAluno extends Aluno implements EntradaDados {
    @Override
    public void lerDados() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Nome: ");
        this.nome = teclado.nextLine();

        System.out.println("Nota: ");
        this.nota = teclado.nextFloat();

        if (this.nota >= 6) {
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }

    }
}
