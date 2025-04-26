package HerancaMetodosEx;

import java.util.Scanner;

public class ClassePessoa {
    public String  nome;
    public int idade;

    void apresentar(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Qual é seu nome?");
        this.nome = teclado.nextLine();

        System.out.println("Digite sua idade");
        this.idade = teclado.nextInt();

        System.out.println("O nome do usuário é " + this.nome + " " + this.idade );
        teclado.close();
    }


}
