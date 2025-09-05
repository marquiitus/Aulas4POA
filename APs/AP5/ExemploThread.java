package APs.AP5;

public class ExemploThread {
  //Interface 
  static class TI implements Runnable {
	  private int tempo;
  	private String msg;

	  public TI(int tempo, String msg) {
	  	super();
	  	this.tempo = tempo;
	  	this.msg = msg;
	  }

	  public void run() {
	  	for (int i = 0; i < 100; i++) {
	  		try {
	  			Thread.sleep(tempo);
	  		} catch (InterruptedException e) {
	  			e.printStackTrace();
	  		}
	  		System.out.println(msg);
	  	}

	  }
  }
  //Herança
  static class TE extends Thread {
	  private int tempo;
	  private String msg;

	  public TE(int tempo, String msg) {
		  super();
		  this.tempo = tempo;
		  this.msg = msg;
	  }

	  public void run() {
	  	for (int i = 0; i < 100; i++) {
	  		try {
	  			Thread.sleep(tempo);
	  		} catch (InterruptedException e) {
	  			e.printStackTrace();
	  		}
	  		System.out.println(msg);
	  	}

	  }
  }
  //Principal
	public static void main(String[] args) {
		TE t1 = new TE(100, "Tic");
		TE t2 = new TE(100, "Tac");
		t1.start();
		t2.start();
		TI t3 = new TI(100,"Ping");
		TI t4 = new TI(100,"Pong");
		Thread t3t = new Thread(t3);
		Thread t4t = new Thread(t4);
		t3t.start();
		t4t.start();
	}
}