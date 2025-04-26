package herancaMetodos;

public class Principal {
    public static void main(String[] args) {
        
        Metodos gwa = new Metodos();
        MetodoRetorno retorno = new MetodoRetorno();
        MetodoRetornoParametro carro = new MetodoRetornoParametro();

        gwa.imprimirMetodos();
        retorno.calcularNotas();

        carro.turboCarro(30);





    }
}
