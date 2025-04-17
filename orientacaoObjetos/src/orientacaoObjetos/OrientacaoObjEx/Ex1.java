package orientacaoObjetos.OrientacaoObjEx;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Ex1Class ex1 = new Ex1Class();
        
        System.out.println("Digite sua primeira nota: ");
        ex1.nota1 = teclado.nextFloat();

        System.out.println("Digite sua segunda nota: ");
        ex1.nota2 = teclado.nextFloat();

        ex1.media = (ex1.nota1 + ex1.nota2)/2;

        System.out.println("Sua média é " + ex1.media);
        teclado.close();
    }
}
