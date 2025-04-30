package HerancaMetodosEx;

import java.util.Scanner;

public class ClasseCalculadora {
    public double a;
    public double b;

    double adicao(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        this.a = teclado.nextDouble();

        System.out.println("Digite o valor de B");
        this.b = teclado.nextDouble();

        return a + b;

    }

    double subtracao(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        this.a = teclado.nextDouble();

        System.out.println("Digite o valor de B");
        this.b = teclado.nextDouble();

        return a - b;

    }

    double multiplicacao(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        this.a = teclado.nextDouble();

        System.out.println("Digite o valor de B");
        this.b = teclado.nextDouble();

        return a * b;

    }

    
    double divisão(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o valor de A");
        this.a = teclado.nextDouble();

        System.out.println("Digite o valor de B");
        this.b = teclado.nextDouble();

        return a / b;
    }



    
}
