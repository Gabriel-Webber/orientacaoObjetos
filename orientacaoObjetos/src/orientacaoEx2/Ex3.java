package orientacaoEx2;

import java.util.Scanner;



public class Ex3 {
public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    Classes ex3 = new Classes();

    System.out.println("Digite sua nota1: ");
    ex3.nota1 = teclado.nextFloat();

    System.out.println("Digite sua nota2 ");
    ex3.nota2 = teclado.nextFloat(); 

    System.out.println("Digite nota3 ");
    ex3.nota3 = teclado.nextFloat();

    ex3.media = (ex3.nota1 + ex3.nota2 + ex3.nota3)/3;

    if(ex3.media >= 7){
        System.out.println("Aprovado");
    }else if(ex3.media >=5 ){
        System.out.println("Recuperação");
    }else{
     System.out.println("Reprovado ");
    }

 teclado.close();
}

}