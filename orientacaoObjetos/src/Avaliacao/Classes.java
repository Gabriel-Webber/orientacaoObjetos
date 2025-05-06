package Avaliacao;

import java.util.Scanner;

public class Classes {

    Moto moto = new Moto();
    Carro carro = new Carro();

    public String nome;
    public String matricula;
    public String curso;

    public String login = "gabriel.webber";
    public int senha = 12345;

    void ler() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome");
        this.nome = teclado.nextLine();

        System.out.println("Digite seu login");
        this.login = teclado.nextLine();

        System.out.println("Digite sua senha");
        this.senha = teclado.nextInt();

        if (this.login.equals("gabriel.webber") && this.senha == 12345) {
            System.out.println("Login concluido");
        } else {
            System.out.println("Falha no login");
        }

    }

    public String produto;
    public double preco;
    public double desconto;

    void fds() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o produto");
        this.produto = teclado.nextLine();

        System.out.println("Digite o preço do produto");
        this.preco = teclado.nextDouble();

        if (this.preco >= 100) {
            this.desconto = (this.preco * 0.90);
        } else {
            System.out.println("O preço do produto não recebe desconto");
        }
        System.out.println("o preço fica " + this.desconto);
    }

    // ex4
    public String titular;
    public Double saldo;
    public double valor;

    // ex6
    // public static void main(String[] args) {
    // Vendas vendas = new Vendas();
    // vendas.vendas();
    // }

    // ex7
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Produto p = new Produto();
        System.out.print("Nome do produto: ");
        p.nome = teclado.nextLine();

        System.out.print("Categoria: ");
        p.categoria = teclado.nextLine();

        System.out.print("Preço: ");
        p.preco = teclado.nextDouble();

        System.out.print("Estoque: ");
        p.estoque = teclado.nextInt();

        System.out.print("Quantidade para adicionar ao estoque: ");
        int qtd = teclado.nextInt();
        p.estoque += qtd;
        
        System.out.println("\nProduto: " + p.nome);
        System.out.println("Categoria: " + p.categoria);
        System.out.println("Preço: R$" + p.preco);
        System.out.println("Estoque atualizado: " + p.estoque);
    }
}
