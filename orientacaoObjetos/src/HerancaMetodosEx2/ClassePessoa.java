package HerancaMetodosEx2;

import java.util.Scanner;

public class ClassePessoa {
    public String nome;
    public int idade;

    void cadastro (){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o seu nome");
        this.nome = teclado.nextLine();

        System.out.println("Digite a sua idade");
        this.idade = teclado.nextInt();
        teclado.close();
    }

    void exibir(){
        System.out.println("O nome do cadastrado foi " + this.nome + " sua idade é " + this.idade);

    }

}
