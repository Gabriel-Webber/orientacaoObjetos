package HerancaMetodosEx2;

import java.util.Scanner;

public class Andoid {
    public String nomeAPP;
    public int versaoNes;
    public int versaoCell;

    void leituraDd() {
        Scanner teclado = new Scanner(System.in);
        // pedindo os valores
        System.out.println("qual é o nome do app");
        this.nomeAPP = teclado.nextLine();
        
        System.out.println("Digite o nome da versão necessaria para o app");
        this.versaoNes = teclado.nextInt();

        System.out.println("Digite a versão do seu android");
        this.versaoCell = teclado.nextInt();

        teclado.close();
    }
    
    void fds(){
        if(this.versaoNes >= this.versaoCell ){
            System.out.println("Não é compativel");
        }else{
            System.out.println("É compativel");
        }
    }
}
