package HerancaMetodosEx;

import java.util.Scanner;

public class ClasseLivro {
    public String titulo;
    public String autor;

    void livro(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual livro que você pegou?");
        this.titulo = teclado.nextLine();

        System.out.println("Parece legal que escreveu ele?");
        this.autor = teclado.nextLine();

        System.out.println("Lembrarei livro " + this.titulo + " do autor " + this.autor);
        teclado.close();
    }

}
