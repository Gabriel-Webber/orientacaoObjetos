package Polimorfismo;

import java.util.Scanner;

public class ScannerCarro extends Veiculo implements EntradaDados {
    @Override
    public void lerDados() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Marca: ");
        this.marca = teclado.nextLine();

        System.out.println("Ano: ");
        this.ano = teclado.nextInt();

        System.out.println("A maraca: " + this.marca + " e o ano do carro " + this.ano);

    }
}
