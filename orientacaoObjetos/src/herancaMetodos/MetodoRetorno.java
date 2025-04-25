package herancaMetodos;

import java.util.Scanner;

public class MetodoRetorno {
    
    public String nome;
    public Float n1;
    public Float n2;

    //Método com Retorno
    Float calcularNotas(){

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Informe a nota 1");
        this.n1 = teclado.nextFloat();

        System.out.println("Informe a Nota 2");
        this.n2 = teclado.nextFloat();

        Float media = (this.n1 + this.n2)/2;

        System.out.println(media);
        teclado.close();
        return media;
        
    }


}
