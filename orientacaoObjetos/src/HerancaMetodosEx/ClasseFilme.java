package HerancaMetodosEx;

import java.util.Scanner;

public class ClasseFilme {
    public String titulo;
    public String ano;

    void filmasso(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("digite um filme");
        this.titulo = teclado.nextLine();

        System.out.println("Digite qual o ano do filme ");
        this.ano = teclado.nextLine();

        System.out.println(this.titulo + " " + this.ano);

        teclado.close();
    }

}
