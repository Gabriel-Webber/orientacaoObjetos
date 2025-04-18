package orientacaoObjetos.OrientacaoObjEx;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Ex5Class obj = new Ex5Class();

        System.out.println("Escreva seu salário: ");
        obj.salarioB = teclado.nextDouble();

        obj.bonus = (obj.salarioB * 0.20) + obj.salarioB;


        obj.salarioL = obj.bonus - (obj.bonus*0.07);
        
        System.out.println(obj.salarioL);

        teclado.close();
    }
}
