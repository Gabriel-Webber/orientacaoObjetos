package HerancaMetodosEx;

public class Principal {
    public static void main(String[] args) {
        ClasseProduto tf = new ClasseProduto();
        ClassePessoa imprimir = new ClassePessoa();
        ClasseTriangulo area = new ClasseTriangulo();
        ClasseAluno prova = new ClasseAluno();
        ClasseLivro bom = new ClasseLivro();
        ClasseAnimal anima = new ClasseAnimal();
        ClasseFilme film = new ClasseFilme();
        ClasseFatura fa = new ClasseFatura();
        ClasseHora hor = new ClasseHora();
        ClasseCalculadora sla = new ClasseCalculadora();



        imprimir.apresentar();
        area.area();
        tf.produto();
        prova.aprovação();
        bom.livro();
        anima.somAnimal();
        film.filmasso();
        fa.calculoTotal();
        hor.fds();
        System.out.println(sla.adicao() );
        System.out.println(sla.subtracao() );
        System.out.println(sla.multiplicacao() );
        System.out.println(sla.divisão() );

    }
}
