import entities.BoletoPagamento;
import entities.CartaoCreditoPagamento;
import entities.ProcessarPagamentos;

public class TesteStrategy {
    public static void main(String[] args) {
        ProcessarPagamentos processar = new ProcessarPagamentos(new CartaoCreditoPagamento("10", "carla", 2345));
        processar.processarPagamentos(190);
        processar.setStrategy(new BoletoPagamento("12345689123456778"));
        processar.processarPagamentos(190);

    }

}
