package HerancaMetodosEx2;

import java.util.Scanner;

public class ClasseEx3 {
    public String titulo;
    public String autor;

    void Livro (){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do livro cadastro");
        this.titulo = teclado.nextLine();

        System.out.println("Qual o autor?");
        this.autor = teclado.nextLine();
        teclado.close();
    }

    void mostrar(){
        System.out.println("O livro escolhido foi " + this.titulo + " o autor é  " + this.autor);

    }

}
