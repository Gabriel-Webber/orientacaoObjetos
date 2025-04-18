package orientacaoEx2;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Classes ex2 = new Classes();

        System.out.println("Digite um valor");
        ex2.valor1 = teclado.nextInt();

        if(ex2.valor1 % 2 == 0){
            System.out.println("É par ");

        }else{  
            System.out.println(" é ímpar");
        }


        teclado.close();

    }
}
