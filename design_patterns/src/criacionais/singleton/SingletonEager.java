package criacionais.singleton;

public class SingletonEager {
	
	private static final SingletonEager instancia = new SingletonEager();
	private int contador = 0;
	
	private SingletonEager() {
		System.out.println("[Eager] Instaância criada no carregamento da classe. . .");
	}
	
	public static SingletonEager getInstance() {
		return instancia;
	}
	
	public void incrementar() {
		contador++;
	}
	
	public int getContator() {
		return contador;
	}

}
