package HerancaMetodosEx;

import java.util.Scanner;

public class ClasseFatura {
    public String descricao;
    public int quant;
    public float precoUnitario;
    public double tottal;

    void calculoTotal(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite qual a fatura");
        this.descricao = teclado.nextLine();

        System.out.println("Digite quantas faturas tem");
        this.quant = teclado.nextInt();

        System.out.println("Digite o valor unitário");
        this.precoUnitario = teclado.nextFloat();

        this.tottal = this.quant * this.precoUnitario;

        System.out.println(this.tottal);
    }



}
