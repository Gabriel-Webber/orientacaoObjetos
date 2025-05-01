package HerancaMetodosEx2;

import java.util.Scanner;

public class Calorias {
    public String nomeA;
    public int tempo;
    public int caloriaGastaPm;
    public int gastofinal;

    void fds(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome da atividade");
        this.nomeA = teclado.nextLine();

        System.out.println("Digite o tempo em que fez a atividade");
        this.tempo = teclado.nextInt();

        System.out.println("Digite as perdas caloricas por minutoi");
        this.caloriaGastaPm = teclado.nextInt();
    }

    void dura(){
        this.gastofinal = this.tempo/ this.caloriaGastaPm;
        System.out.println(this.gastofinal);
    }
}
