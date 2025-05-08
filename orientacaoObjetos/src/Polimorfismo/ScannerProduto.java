package Polimorfismo;

import java.util.Scanner;

public class ScannerProduto extends Produto implements EntradaDados {
    @Override
    public void lerDados() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o nome do produto");
        this.nome = teclado.nextLine();

        System.out.println("Digite o preço");
        this.preco = teclado.nextDouble();

        System.out.println("Nome: " + this.nome + " Preço: " + this.preco );
    

    }

}
