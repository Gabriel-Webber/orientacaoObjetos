package Avaliacao;

import java.util.Scanner;

public class Carro extends Ex5 {
    
        Ex5 c = new Ex5();
        void ha(){
            Ex5 sf = new Ex5();
            Scanner teclado = new Scanner(System.in);
            System.out.println("Digite o modelo do seu carro");
            sf.modelo = teclado.nextLine();

            System.out.println("O modelo é" + sf.modelo);
        }

    
}
