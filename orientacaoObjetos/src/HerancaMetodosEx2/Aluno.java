package HerancaMetodosEx2;

import java.util.Scanner;

public class Aluno extends Pessoa {
    public String curso;

    void lerDados(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome");
        this.nome = teclado.nextLine();
        System.out.println("Digite seu curso");
        this.curso = teclado.nextLine();
    }

    void exibir(){
        System.out.println("Seu nome é " + this.nome + " e está cursando " + this.curso);
    }
}
