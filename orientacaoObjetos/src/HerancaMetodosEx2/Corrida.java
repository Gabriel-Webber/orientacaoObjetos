package HerancaMetodosEx2;

import java.util.Scanner;

public class Corrida {
    public String nome;
    public double distancia;
    public double tempo;
    public double calculos;

    void leitura(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite seu nome");
        this.nome = teclado.nextLine();

        System.out.println("Digite a distancia que percorreu em Km");
        this.distancia = teclado.nextDouble();

        System.out.println("Digite seu tempo na corrida em minutos");
        this.tempo = teclado.nextDouble();
        teclado.close();
    }

    void calculo(){
        this.calculos = (this.distancia / this.tempo);

        System.out.println("Na sua corrida sua velocidade média foi " + this.calculos + " K/h.");

    }
}
