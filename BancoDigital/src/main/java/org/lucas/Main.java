package org.lucas;

import org.lucas.entities.*;

import java.util.Arrays;

public class Main {
  public static void main(String[] args) {

    Cliente cliente1 = new Cliente();
    cliente1.setNome("Lucas");
    Cliente cliente2 = new Cliente();
    cliente2.setNome("Ian");
    Cliente cliente3 = new Cliente();
    cliente3.setNome("Leonardo");
    Cliente cliente4 = new Cliente();
    cliente4.setNome("Johann");

    Banco banco = new Banco();
    banco.setClientes(Arrays.asList(cliente1, cliente2, cliente3, cliente4));
    banco.listarClientes();

    Conta contaCorrente = new ContaCorrente(cliente1);
    contaCorrente.depositar(100);

    Conta contaPoupanca = new ContaPoupanca(cliente1);
    contaCorrente.transferir(100, contaPoupanca);

    contaCorrente.imprimirExtrato();
    System.out.println();
    contaPoupanca.imprimirExtrato();
  }
}