package ExemplosPOO;

import java.util.Scanner;

public class heranca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ClasseMae mae = new ClasseMae();
        ClasseFilho filho = new ClasseFilho();
        ClasseFilha filha = new ClasseFilha();

        System.out.println("Digite o nome da mãe: ");
        mae.nome = teclado.nextLine();

        System.out.println("Digite a idade da mãe: ");
        mae.idade = teclado.nextInt();

        System.out.println("Digite o nascimento da mãe: ");
        mae.ano = teclado.nextInt();
        
        mae.cpf = teclado.nextLine();
        System.out.println("Digite o cpf da mãe: ");
        mae.cpf = teclado.nextLine();
        
        System.out.println("Digite a quantidade dew filhos");
        mae.qtdfilhos = teclado.nextInt();
        
        //Informações do filho

        System.out.println("Digite o nome do filho");
        filho.nome = teclado.nextLine();

        filho.cpf = teclado.nextLine();
        System.out.println("Digite o cpf do filho");
        filho.cpf = teclado.nextLine();

        //Informações da filha 
        System.out.println("Digite o nome da filha: ");
        filha.nome = teclado.nextLine();
        
        filha.cpf = teclado.nextLine();
        System.out.println("Digite o cpf da filha: ");
        filha.cpf = teclado.nextLine();


        System.out.println("Mãe " + mae.nome + " " + mae.idade + " " + mae.ano + " " + mae.cpf + " " + mae.qtdfilhos );
        System.out.println("Filho " + filho.nome + filho.cpf );
        System.out.println("Filha " + filha.nome + " "+ filha.cpf );

        teclado.close();
    }
}
