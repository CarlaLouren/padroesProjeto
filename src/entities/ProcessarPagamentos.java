package entities;

public class ProcessarPagamentos{

private PagamentoStrategy strategy;

public ProcessarPagamentos(PagamentoStrategy strategy){
this.strategy=strategy;
}
public void setStrategy( PagamentoStrategy strategy){
    this.strategy=strategy;
}
public void processarPagamentos(double valor){
strategy.pagar(valor);



}
}