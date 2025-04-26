package HerancaMetodosEx;

import java.util.Scanner;

public class ClasseProduto {
    public String nome;
    public Float preço;
    public int quant;

    void produto (){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome de seu produto");
        this.nome = teclado.nextLine();

        System.out.println("Digte o preço do seu produto");
        this.preço = teclado.nextFloat();

        System.out.println("Qual a quantidade de produto existente em seu estoque?");
        this.quant = teclado.nextInt();

        System.out.println("Você tem cerca de " + this.quant + " de produtos em seu estoque.");
        teclado.close();
    }
    

}
