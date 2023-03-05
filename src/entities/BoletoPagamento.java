package entities;

/**
 * BoletoPagamento
 */
public class BoletoPagamento implements PagamentoStrategy{

    private String codigoDeBarra;
    public BoletoPagamento(String codigoDeBarra){
        this.codigoDeBarra=codigoDeBarra;

    }
    @Override
    public void pagar(double valor) {
       System.out.println("pagamento realizado via oleto bancario");
    }

}