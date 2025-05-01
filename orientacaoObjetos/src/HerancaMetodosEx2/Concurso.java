package HerancaMetodosEx2;

import java.util.Scanner;

public class Concurso {
    public String nome;
    public int nota;

    void leituraDd() {
        Scanner teclado = new Scanner(System.in);
        // pedindo os valores
        System.out.println("qual é seu nome");
        this.nome = teclado.nextLine();
        
        System.out.println("Digite sua nota");
        this.nota = teclado.nextInt();
        teclado.close();
    }

    void descobrir() {
        Scanner teclado = new Scanner(System.in);

        if (this.nota >= 70) {
            System.out.println("Passou!!");
        } else {
            System.out.println("Eliminado");
        }
        teclado.close();
    }
}
