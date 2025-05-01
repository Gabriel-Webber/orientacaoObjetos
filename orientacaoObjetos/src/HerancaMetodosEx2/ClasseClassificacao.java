package HerancaMetodosEx2;

import java.util.Scanner;

public class ClasseClassificacao {
    public String titulo;
    public int classificacao;
    public int idade;
    
    void lerdados(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual o nome do filme?");
        this.titulo = teclado.nextLine();

        System.out.println("Qual a classificação do filme?");
        this.classificacao = teclado.nextInt();

        teclado.close();
    }
    void podeAssistir(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        this.idade = teclado.nextInt();

        if(this.classificacao == 18 && this.idade >= 18){
            System.out.println("Pode assistir");

        }else if(this.classificacao == 16 && this.idade >= 16){
            System.out.println("Pode assistir");
        }else if(this.classificacao == 12 && this.idade >= 12){
            System.out.println("pode assistir");

        }else if(this.classificacao == 10 && this.idade >= 10){

        }else{
            System.out.println("Não pode assitir");
        }
        teclado.close();

    }

}
