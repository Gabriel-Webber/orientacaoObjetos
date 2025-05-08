package Polimorfismo;

import java.util.Scanner;

public class ScannerLivro extends Livro implements EntradaDados {
    @Override
    public void lerDados() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o nome do livro");
        this.titulo = teclado.nextLine();

        System.out.println("Digite o autor");
        this.autor = teclado.nextLine();

        System.out.println("Titulo: " + this.titulo + " autor: " + this.autor);
    
    }
}
