package entities;

public class CartaoCreditoPagamento  implements PagamentoStrategy{
    private String numeroDoCartao;
    private String titularCartao;
    private int cvv;
    public CartaoCreditoPagamento(String numeroDoCartao,String titularCartao, int cvv){
        this.numeroDoCartao=numeroDoCartao;
        this.titularCartao=titularCartao;
        this.cvv=cvv;
    }

@Override
    public void pagar(double valor) {
       System.out.println("pagamento efetuado pelo credCar");
    }
}

