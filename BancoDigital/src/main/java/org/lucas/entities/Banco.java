package org.lucas.entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {

  private String nome;
  private List<Cliente> clientes;

  public Banco() {
    this.nome = nome;
    this.clientes = new ArrayList<>();
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public List<Cliente> getClientes() {
    return clientes;
  }

  public void setClientes(List<Cliente> clientes) {
    this.clientes = clientes;
  }

  public void listarClientes() {
    if (clientes.isEmpty()) {
      System.out.println("--- Nenhum Cliente Cadastrado ---");
    } else {
      System.out.println("--- Clientes Cadastrados ---");
      for (Cliente cliente : clientes) {
        System.out.println();
        System.out.println(cliente.getNome());
      }
    }
  }
}
