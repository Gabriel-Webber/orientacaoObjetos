package HerancaMetodosEx2;

import java.util.Scanner;

public class Turma {
    public String nomeTurma;
    public Float notaTurma;

    void ler(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o nome da sua turma");
        this.nomeTurma = teclado.nextLine();

        System.out.println("Digite a nota que sua turma recebeu");
        this.notaTurma = teclado.nextFloat();

        if (this.notaTurma >= 8) {
            System.out.println("Excelente");

        }else if(this.notaTurma >= 6 || this.notaTurma < 8){
            System.out.println("precisam melhorar");
        }
        
    }

    

}
