package HerancaMetodosEx2;

import java.util.Scanner;

public class ClasseFuncionario {
    public String nome;
    public double salarioBase;
    public double salarioL = 0;

    void lerDados(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite seu nome");
        this.nome = teclado.nextLine();

        System.out.println(" digite seu sálario");
        this.salarioBase = teclado.nextDouble();

        this.salarioL = (this.salarioBase*0.10)+this.salarioBase;
        teclado.close();
    }

 
    void calculoTotal(){
        System.out.println("Senhor(a) seu salário junto ao bonus é " + this.salarioL);
    }

}
