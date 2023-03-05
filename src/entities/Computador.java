package entities;

public class Computador {
  private CPU cpu;

  public Computador() {
    this.cpu = new CPU();

  }

  public void iniciarComputador() {
    cpu.executar();

  }

  public void desligarComputador() {
    cpu.desligar();

  }
}
