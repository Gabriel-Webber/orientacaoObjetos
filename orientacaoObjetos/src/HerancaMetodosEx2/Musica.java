package HerancaMetodosEx2;

import java.util.Scanner;

public class Musica {
    public String nome;
    public int duracao;

    void fds(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome da música");
        this.nome = teclado.nextLine();

        System.out.println("Digite em segundos a duração da música");
        this.duracao = teclado.nextInt();
    }


    void dura(){
        if (this.duracao < 120) {
            System.out.println("Curta");
        }else if(this.duracao > 120 && this.duracao <= 300){
            System.out.println("Média");
        }else{
            System.out.println("Longa");
        }
    }
}
