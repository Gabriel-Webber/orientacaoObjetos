package orientacaoObjetos.OrientacaoObjEx;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
         Scanner teclado = new Scanner(System.in);
    Ex4Class objeto = new Ex4Class();

    System.out.println("Digite o comprimento:");
    objeto.comprimento = teclado.nextInt();

    System.out.println("Digite a largura da sua caixa: ");
    objeto.largura = teclado.nextInt();

    System.out.println("Digite o valor da altura da caixa: ");
    objeto.altura = teclado.nextInt();

    objeto.volume = (objeto.comprimento * objeto.largura* objeto.altura);

    System.out.println("A área da sua caixa é: " + objeto.volume);
    teclado.close();
    }
}
