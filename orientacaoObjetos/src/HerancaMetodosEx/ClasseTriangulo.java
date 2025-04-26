package HerancaMetodosEx;

import java.util.Scanner;

public class ClasseTriangulo {
    public int altura;
    public int largura;
    public int area;

    void area(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite a largura do triangulo: ");
        this.largura = teclado.nextInt();

        System.out.println("Digite a altura do triangulo");
        this.altura = teclado.nextInt();

        this.area = (this.largura * this.altura)/2;
        System.out.println("A área do seu triangulo é de " + this.area);
        teclado.close();
    }



}
