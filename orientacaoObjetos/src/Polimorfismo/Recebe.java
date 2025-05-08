package Polimorfismo;

import java.util.Scanner;

public class Recebe extends Pessoa implements EntradaDados {
   
    @Override
    public void lerDados(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome.");
        this.nome = teclado.nextLine();

        System.out.println("Digite seu emaisl");
        this.email = teclado.nextLine();

        System.out.println("Nome " + this.nome + " email " + this.email );
    }
}
