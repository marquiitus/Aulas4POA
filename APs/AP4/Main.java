package APs.AP4;

public class Main {
  public static void main (String[] args) {

    Elefante e1 = new Elefante("Dumbo", 500);
    Elefante e2 = new Elefante("Hugo", 800);
    Elefante e3 = new Elefante("Marcos", 1000);

    e1.start();
    e2.start();
    e3.start();

    try {
      e1.join();
      e2.join();
      e3.join();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    System.out.println("\nTodos os elefantes terminaram a caminhada!");
  }
}