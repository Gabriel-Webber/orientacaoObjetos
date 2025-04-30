package HerancaMetodosEx2;

import java.util.Scanner;

public class ClasseCalcul {
    public double a;
    public double b;
    public String digitado;

    void leituraDd() {
        Scanner teclado = new Scanner(System.in);
        // pedindo os valores
        System.out.println("Digite o valor de A");
        this.a = teclado.nextDouble();
        System.out.println("E o valor de B");
        this.b = teclado.nextDouble();

    }

    void descobrir() {
        Scanner teclado = new Scanner(System.in);
        // descobrindo se é soma o subtração
        this.digitado = teclado.nextLine();
        System.out.println("Se quiser somar digite '+' ou se quiser subtrair digite '-' ");
        this.digitado = teclado.nextLine();

        if (this.digitado.equals("+")) {
            System.out.println(this.a + this.b);
        } else if (this.digitado.equals("-")) {
            System.out.println(this.a - this.b);
        }
    }

}
