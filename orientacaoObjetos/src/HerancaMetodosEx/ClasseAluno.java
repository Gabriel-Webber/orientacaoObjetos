package HerancaMetodosEx;

import java.util.Scanner;

public class ClasseAluno {
    public String nome;
    public float nota;

    void aprovação (){
        Scanner teclado = new Scanner( System.in);

        System.out.println("Qual seu nome?");
        this.nome = teclado.nextLine();

        System.out.println("Qual foi sua nota?");
        this.nota = teclado.nextFloat();

        if(this.nota >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
        teclado.close();
    }




}
