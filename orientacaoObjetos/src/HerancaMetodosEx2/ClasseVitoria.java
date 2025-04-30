package HerancaMetodosEx2;

import java.util.Scanner;

public class ClasseVitoria {
    public String nome;
    public int pont; 

    void leituraDd() {
        Scanner teclado = new Scanner(System.in);
        // pedindo os valores
        System.out.println("qual é seu nome");
        this.nome = teclado.nextLine();
        
        System.out.println("Digite sua pontuação");
        this.pont = teclado.nextInt();

    }

    void descobrir() {
        Scanner teclado = new Scanner(System.in);

        if (this.pont >= 1000) {
            System.out.println("Vitória!!");
        } else {
            System.out.println("Tente novamente");
        }
    }
}
