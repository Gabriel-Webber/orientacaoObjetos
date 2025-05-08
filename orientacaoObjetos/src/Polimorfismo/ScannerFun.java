package Polimorfismo;

import java.util.Scanner;

public class ScannerFun extends Funcionario implements EntradaDados {
    @Override
    public void lerDados() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o seu nome");
        this.nome = teclado.nextLine();

        System.out.println("Digite o cargo");
        this.cargo = teclado.nextLine();

        System.out.println("Digite o salario");
        this.salario = teclado.nextDouble();

        System.out.println("Nome: " + this.nome + " Cargo: " + this.cargo + " salario: " + this.salario );
    


    }    
}
