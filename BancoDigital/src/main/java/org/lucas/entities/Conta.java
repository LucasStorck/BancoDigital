package org.lucas.entities;

public abstract class Conta implements IConta {

  private static final int AGENCIA = 1;
  private static int SEQUENCIAL = 1;

  protected int agencia;
  protected int numero;
  protected double saldo;
  protected Cliente cliente;

  public Conta(Cliente cliente) {
    this.agencia = AGENCIA;
    this.numero = SEQUENCIAL++;
    this.cliente = cliente;
  }

  @Override
  public void sacar(double valor) {
    saldo -= valor;
  }

  @Override
  public void depositar(double valor) {
    saldo += valor;
  }

  @Override
  public void transferir(double valor, IConta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
  }

  public int getAgencia() {
    return agencia;
  }

  public int getNumero() {
    return numero;
  }

  public double getSaldo() {
    return saldo;
  }

  public Cliente getCliente() {
    return cliente;
  }

  protected void imprimirInfosComuns() {
    System.out.println(String.format("Titular da Conta: %s", this.cliente.getNome()));
    System.out.println();
    System.out.println(String.format("Agência: %d%n ", this.agencia));
    System.out.println(String.format("Número: %d%n ", this.numero));
    System.out.println(String.format("Saldo: %.2f ", this.saldo));
  }
}
