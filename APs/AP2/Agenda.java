package APs.AP2;

import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Agenda {

  public static void escrita(String nome, String telefone) {

    try {

      FileWriter fw = new FileWriter("c:/arquivo/agenda.txt", true);
      BufferedWriter bw = new BufferedWriter(fw);

      bw.write(nome + ";" + telefone);
      bw.newLine();
      bw.close();
      fw.close();
    } catch (IOException e) {

      e.printStackTrace();
    }
  }

  public static void lerTodos() {
    try {
      FileReader fr = new FileReader("c:/arquivo/agenda.txt");
      BufferedReader br = new BufferedReader(fr);

      while(br.ready()) {

        String aux = br.readLine();
        String [] dados = aux.split(";");
        System.out.println("Nome:" + dados[0] + "- Telefone:" + dados[1]);
      }

      br.close();
      fr.close();
    } catch (FileNotFoundException e) {

      e.printStackTrace();
    }
     catch (IOException e) {

      e.printStackTrace();
    }
  }

  public static void ler(String nome) { 
    try {
      FileReader fr = new FileReader("c:/arquivo/agenda.txt");
      BufferedReader br = new BufferedReader(fr);
      boolean encontrado = false; 

      while(br.ready()) {

        String aux = br.readLine();

        if(aux.contains(nome)) {
          String [] dados = aux.split(";");
          System.out.println("Nome:" + dados[0] + "- Telefone:" + dados[1]);
          encontrado = true;
        }
      }

      if(!encontrado)
        System.out.println("Dados não encontrados!");

      br.close();
      fr.close();
    } catch (FileNotFoundException e) {

      e.printStackTrace();
    }
     catch (IOException e) {

      e.printStackTrace();
    }
  }
} 