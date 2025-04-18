package orientacaoObjetos;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        Classe2 ex2 = new Classe2();

        System.out.println("Digite sua nota1 ");
        ex2.n1 = teclado.nextFloat();

        System.out.println("Digite sua nota2 ");
        ex2.n2 = teclado.nextFloat();

        ex2.media = (ex2.n1 + ex2.n2)/2;

        if(ex2.media >= 6){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }



        teclado.close();
    }
}
