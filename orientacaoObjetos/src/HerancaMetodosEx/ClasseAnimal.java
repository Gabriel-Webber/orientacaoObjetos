package HerancaMetodosEx;

import java.util.Scanner;

public class ClasseAnimal {
    public String nome;
    public String especie;

    void somAnimal(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Escreva um animal");
        this.nome = teclado.nextLine();

        System.out.println("Qual a especie?");
        this.especie = teclado.nextLine();

        System.out.println("O som do(a) animal é " +  "'Som generioco'");
        teclado.close();
    }


}
