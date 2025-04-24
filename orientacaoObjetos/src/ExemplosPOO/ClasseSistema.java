package ExemplosPOO;

import java.util.Scanner;

public class ClasseSistema {
    public static void main(String[] args) {
        //classes
        Scanner teclado = new Scanner(System.in);
        ClasseFornecedor fornecedor = new ClasseFornecedor();
        ClasseCliente cliente = new ClasseCliente();
        ClasseProduto produto = new ClasseProduto();
        ClasseUsuario usuario = new ClasseUsuario();

        //atributos do objeto cliente
        System.out.println("Cadastro o Cliente");
        cliente.nome = teclado.nextLine();

        System.out.println("Cadastro de CPF");
        cliente.cpf = teclado.nextLine();

        System.out.println("Cadastre a razão social");
        cliente.razaoSocial = teclado.nextLine();

        //atributos do objeto fornecedor
        System.out.println("Cadastro de fornecedor");git
        fornecedor.nome = teclado.nextLine();

        System.out.println("Cadastro de CPF");
        fornecedor.cpf = teclado.nextLine();

        System.out.println("Cadastre a quantidade do estoque");
        fornecedor.estoque = teclado.nextInt();

        //cadastro produto
        cliente.nome = teclado.nextLine();
        System.out.println("Cadastro o produto");
        produto.nome = teclado.nextLine();

        System.out.println("Cadastro de CPF");
        produto.cpf = teclado.nextLine();

        System.out.println("Cadastre o preço do produto ");
        produto.preco = teclado.nextFloat();

        //cadastro usuario
        usuario.nome = teclado.nextLine();
        System.out.println("Cadastro o usuário");
        usuario.nome = teclado.nextLine();

        System.out.println("Cadastro de CPF");
        usuario.cpf = teclado.nextLine();

        System.out.println("Cadastre sua senha  ");
        usuario.senha = teclado.nextLine();

        //impressões 

        System.out.println("Cliente cadastrado como" + cliente.nome + " " + cliente.cpf + " " + " " + " e sua razão social é" + cliente.razaoSocial);
        System.out.println("Cadastro fornecedor " + fornecedor.nome + " " + "Cpf " + fornecedor.cpf + " " + fornecedor.estoque);
        System.out.println("Cadastro de produto" + produto.nome + " " + "cpf " + produto.cpf + " " + "cadastro de preço " + produto.preco);
        System.out.println("Cadastro de usuário" + usuario.nome + " " + "cpf " + usuario.cpf + " " + "cadastro de senha " + usuario.senha);
        



        teclado.close();
    }
}
