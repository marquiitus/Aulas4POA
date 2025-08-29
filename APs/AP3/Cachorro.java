package APs.AP3;

import java.io.Serializable;

public class Cachorro implements Serializable {
    
  private String nome;
  private int idade;
  private transient String numeroMicrochip;

  public Cachorro(String nome, int idade, String numeroMicrochip) {
    this.nome = nome;
    this.idade = idade;
    this.numeroMicrochip = numeroMicrochip;
  }

  @Override
  public String toString() {
    return "Cachorro [nome=" + this.nome + ", idade=" + this.idade + ", numeroMicrochip=" + this.numeroMicrochip + "]";
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public String getNumeroMicrochip() {
    return this.numeroMicrochip;
  }

  public void setNumeroMicrochip(String numeroMicrochip) {
    this.numeroMicrochip = numeroMicrochip;
  }
}