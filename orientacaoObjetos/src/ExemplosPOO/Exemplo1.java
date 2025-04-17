package ExemplosPOO;
import java.util.Scanner;

public class Exemplo1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int[] fds = new int[5];

        for(int i = 0; i < fds.length; i++){
            System.out.println("Digite 5 valores: ");
            fds[i] = teclado.nextInt();

        }
        
        for(int i = 0; i < fds.length; i++){
          System.out.println(fds[i]);
        }
        

        teclado.close();

    }
}
