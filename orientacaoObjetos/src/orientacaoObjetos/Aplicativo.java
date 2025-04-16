package orientacaoObjetos;

public class Aplicativo {
    
    public static void main(String[] args) {
        
        Pessoa enzo = new Pessoa();
        Pessoa vinicios = new Pessoa();
        Carro carro = new Carro();


        System.out.println(enzo.nome + " " + enzo.genero + " " + enzo.idade );
        System.out.println(vinicios.nome + " " + vinicios.genero + " " + vinicios.idade);

        System.out.println(carro.nome + " " + carro.marca + " " + " " + carro.ano + " " + carro.km + " "+ carro.combustivel);

    }

}
