package orientacaoObjetos.OrientacaoObjEx;

import java.util.Scanner;

public class Ex2 {
 public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Ex2Class objeto = new Ex2Class();

    System.out.println("Digite a base:");
    objeto.base = teclado.nextInt();

    System.out.println("Digite a altura: ");
    objeto.altura = teclado.nextInt();

    objeto.area = (objeto.base*objeto.altura)/2;

    System.out.println("A área do seu triangulo é: " + objeto.area);
    teclado.close();
 }   
}
