package APs.AP4;

public class Elefante extends Thread {

  private String nome;
  private int tempoDeCaminhada;

  public Elefante(String nome, int tempoDeCaminhada) {
    super(); 
    this.nome = nome;
    this.tempoDeCaminhada = tempoDeCaminhada;
  }

  @Override
  public void run() {
  
    for (int i = 1; i <= 10; i++) {
            
      try {
        Thread.sleep(this.tempoDeCaminhada);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
            
      System.out.println("O elefante " + this.nome + " deu o passo #" + i);
    }
        
    System.out.println("!!! O elefante " + this.nome + " terminou sua caminhada. !!!");
  }
}