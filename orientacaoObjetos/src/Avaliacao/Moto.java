package Avaliacao;

import java.util.Scanner;

public class Moto extends Ex5{
    
    void exibirInfo(){
        Ex5 sf = new Ex5();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o modelo da moto");
        sf.modelo = teclado.nextLine();

        System.out.println("O modelo da sua moto é: " + sf.modelo);
    }
}
