package Avaliacao;

import java.util.Scanner;



public class Vendas {
    public String nome;
    public double vendas;
    public double comissao;

    void vendas(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nomes");
        this.nome = teclado.nextLine();

        System.out.println("Digite suas vendas");
        this.vendas = teclado.nextInt();

        this.comissao = (this.vendas*0.10)+this.vendas;

        System.out.println("Sua seu salario "  + this.comissao );

    }

}
