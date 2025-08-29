package APs.AP3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class PrincipalSerializacao {
  public static void main(String[] args) {

    //serializção
    Cachorro cachorroOriginal = new Cachorro("Bolinha", 7, "MG12345678");

    System.out.println("--- 1. Objeto Original (antes de salvar) ---");
    System.out.println(cachorroOriginal);
        
    try {
      FileOutputStream arquivoDeSaida = new FileOutputStream("cachorro.data");
      ObjectOutputStream escritorDeObjetos = new ObjectOutputStream(arquivoDeSaida);
      escritorDeObjetos.writeObject(cachorroOriginal);
      escritorDeObjetos.close();
      arquivoDeSaida.close();
      System.out.println("\n>>> Objeto serializado com sucesso!\n");
    } catch (IOException e) {
      e.printStackTrace();
    }

    System.out.println("--- 2. Alterando o objeto em memória... ---");
    cachorroOriginal.setIdade(10); // A idade agora é 10
    cachorroOriginal.setNome("Rex");     // O nome agora é Rex
    System.out.println(cachorroOriginal);
    System.out.println("-----------------------------------------\n");
        
    System.out.println("--- 3. Recuperando o objeto do arquivo... ---\n");
    try {
      FileInputStream arquivoDeEntrada = new FileInputStream("cachorro.data");
      ObjectInputStream leitorDeObjetos = new ObjectInputStream(arquivoDeEntrada);

      cachorroOriginal = (Cachorro) leitorDeObjetos.readObject();

      leitorDeObjetos.close();
      arquivoDeEntrada.close();
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }

    System.out.println("--- 4. Objeto Recuperado ---");
    System.out.println(cachorroOriginal);
    System.out.println("\nObserve duas coisas:");
    System.out.println("1. O nome voltou a ser 'Bolinha' e a idade voltou a ser 7 (estado original salvo).");
    System.out.println("2. O 'numeroMicrochip' continua nulo, pois o campo é 'transient'.");
    System.out.println("----------------------------");
  }
}