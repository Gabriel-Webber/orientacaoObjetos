package Avaliacao;

import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Classes c1 = new Classes();
        Classes c2 = new Classes();
        Scanner teclado = new Scanner(System.in);

        System.out.println("digite o primeiro titular");
        c1.titular = teclado.nextLine();

        System.out.println("Qual o saldo do primeir titular");
        c1.saldo = teclado.nextDouble();

        c2.titular = teclado.nextLine();
        System.out.println("Digite o segundo titular");
        c2.titular = teclado.nextLine();

        System.out.println("Digite o saldo do segundo titular");
        c2.saldo = teclado.nextDouble();

        System.out.println("Valor de transferencia da conta 1 para 2");
        c1.valor = teclado.nextDouble();

        if(c1.saldo >= c1.valor){
            c1.saldo -= c1.valor;
            c2.saldo += c1.valor;
        }else{
            System.out.println("Saldo insuficiente");
        }

        System.out.println("Saldo c1 " + c1.saldo);
        System.out.println("Saldo c2 " + c2.saldo);

    }
}
