package HerancaMetodosEx2;

import java.util.Scanner;

public class Festa {
    public String evento; 
    public int pessoasConfirmadas;
    public int limite;

    void ler (){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o nome do evento?");
        this.evento= teclado.nextLine();

        System.out.println("Digite quantas pessoas foram confirmadas");
        this.pessoasConfirmadas = teclado.nextInt();

        System.out.println("Digite a quantidadde maxima da festa");
        this.limite = teclado.nextInt();


    }

    void exibir(){
        if (this.limite < this.pessoasConfirmadas) {
         System.out.println("Está lotado");
        }else{
            System.out.println("Dentro da capacidade");
        }

    }

}
