package HerancaMetodosEx;

import java.util.Scanner;

public class ClasseHora {
    public int hora;
    public int minuto;

    void fds(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite a hora");
        this.hora = teclado.nextInt();

        System.out.println("Digite os minutos.");
        this.minuto = teclado.nextInt();

        System.out.println(this.hora + ":" + this.minuto);

    }



}
