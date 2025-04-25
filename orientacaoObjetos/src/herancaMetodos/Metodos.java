package herancaMetodos;

import java.util.Scanner;

public class Metodos {
    public String nome ;
    public String telefone ;
    public String cpf ;
    public int numero ;
    
    //Método imprimir atributos 
    void imprimirMetodos(){
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome");
        this.nome = teclado.nextLine();

        System.out.println("Digitar telefone");
        this.telefone = teclado.nextLine();

        System.out.println("Digite o cpf");
        this.cpf = teclado.nextLine();
        
        System.out.println("Digite seu numero");
        this.numero = teclado.nextInt();
        
        System.out.println(this.nome + " " + this.telefone + " " + this.numero + " " + this.cpf);      
        teclado.close();
    } 
}
