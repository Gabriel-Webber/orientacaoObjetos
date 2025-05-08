package Polimorfismo;

import java.util.Scanner;

public class ScannerCidade extends Cidade implements EntradaDados {
    @Override
    public void lerDados() {
        Scanner te = new Scanner(System.in);
        System.out.println("Cidade: ");
        this.cidade = te.nextLine();

        System.out.println("Ano: ");
        this.estado = te.nextLine();

        System.out.println("Cidade " + this.cidade + " Estado: " + this.estado) ;


    }


}
