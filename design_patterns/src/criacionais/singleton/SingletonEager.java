package criacionais.singleton;

public class SingletonEager {
	
	/*
	 * Modelo 1 - Eager Inicialization (podemos entender como uma inicialização antecipada "ansiosa")
	 *   - Nesse caso a instância será criada assim assim que a classe for carregada pela JVM, independente de chamada getInstance().
	 *   
	 *   ✅ Vantagem: garante a segurança das treads evitando a concorrência entre elas.
	 *   
	 *   ❌ Desvantagem: se o objeto não for usado, estará desperdiçando recursos
	 *   
	 *   - - - Definições
	 *   - CLASSLOADER: mecanismo da JVM de carregar os arquivos .class
	 *   - 
	 *   
	 *   
	 * */
	
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
