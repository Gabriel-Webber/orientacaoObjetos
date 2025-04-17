package orientacaoObjetos.OrientacaoObjEx;

import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Ex3Class obj = new Ex3Class();

        System.out.println("Digite seu salário: ");
        obj.salarioB = teclado.nextDouble();

        obj.desconto = (obj.salarioB*0.90);
        obj.salarioL = (obj.desconto*0.70);

        System.out.println("Seu sálario após os descontos de 10 e 30% fica " + obj.salarioL);

        teclado.close();
    }
}
