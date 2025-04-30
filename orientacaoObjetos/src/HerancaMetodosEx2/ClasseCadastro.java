package HerancaMetodosEx2;

import java.util.Scanner;

public class ClasseCadastro {
    public String nome;
    public double preco;

    void cadastro (){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do produto para cadastro");
        this.nome = teclado.nextLine();

        System.out.println("Digite o preço do produto:");
        this.preco = teclado.nextInt();
        teclado.close();
    }

    void exibir(){
        System.out.println("O nome do produto cadastrado foi " + this.nome + " e o preço escolhido foi " + this.preco);

    }

}
