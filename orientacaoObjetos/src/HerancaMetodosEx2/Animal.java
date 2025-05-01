package HerancaMetodosEx2;

import java.util.Scanner;

public class Animal {
    public String nome;
    public String tipo;
    
    void ler (){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome do animal");
        this.nome = teclado.nextLine();

        System.out.println("Digite se é um animal domestico");
        this.tipo = teclado.nextLine();

        teclado.close();
    }

    void animal(){
        if(this.tipo.equals("Domestico")){
            System.out.println("Este animal pe domestico");
        }else{
            System.out.println("È um animal selvagem");
        }


        
    }



}
