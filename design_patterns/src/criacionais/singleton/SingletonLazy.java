package criacionais.singleton;

/*
 * Modelo 2 - SingletonLazy -> aqui podemos entender como uma inicialização tardia ou preguiçosa
 *   - A instância só será criada na primeira chamada do getInstance()
 *   
 *   ✅ Vantagem: o recurso não fica alocado, só é gasto qdo realmente for chamado
 *   
 *   ❌ Desvantagem: Não garante o thread-safe. Caso das thread chamem o getInstance() simultaneamente, cada uma vai criar 
 *      o próprio objeto e o sistema vai quebrar pq o Padão Singleton não permite uma dupla instanciação
 *   
 *     
 *   
 * */

public class SingletonLazy {
	
	private static SingletonLazy instancia;
	private int contador = 0;
	
	private SingletonLazy getInstance() {
		if(instancia == null) {
			instancia = new SingletonLazy();
		}
		
		return instancia;
	}
	
	public void incrementar() {
		contador++;
	}
	
	public int getContador() {
		return contador;
	}
	
	

}
