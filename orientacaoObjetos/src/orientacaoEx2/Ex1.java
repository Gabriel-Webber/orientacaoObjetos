package orientacaoEx2;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Classes ex1 = new Classes();

        System.out.println("Escreva o primeiro valor: ");
        ex1.valor1 = teclado.nextInt();

        System.out.println("Digite valor 2 ");
        ex1.valor2 = teclado.nextInt();

        if(ex1.valor1 == ex1.valor2){
            System.out.println("São iguais");
        }else{
            System.out.println("Não são iguais: ");
        }


        teclado.close();
    }
}
