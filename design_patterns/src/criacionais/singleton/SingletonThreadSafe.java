package criacionais.singleton;

/*
 * Modelo 3 - Double-Checked Locking
 *   - Resolve o problema da concorrência do SingletonLazy sem tomar o prejuízo do SingletonEager
 *   
 * COMO FUNCIONA:
 * 1a checagem (sem lock) -> se a instancia ja existe, retorna direto,
 * rapido, sem nunca entrar no bloco synchronized.
 * So entra no synchronized se instancia==null (ou seja, so nas
 * primeiras chamadas concorrentes, antes da instancia existir).
 * 2a checagem (dentro do lock) -> garante que, mesmo que duas threads
 * tenham passado pela 1a checagem ao mesmo tempo, so uma vai criar
 * o objeto.
 *   
 *   ✅ Vantagem: 
 *      - Alta performance: evita gargalos de sincronização em chamadas repetidas
 *      - Lazi Loading: Não dissperdiça recurso; o objeto só é criado no momento em que for solicitado
 *      - Threade-Safe: garante a criação de um único objeto em ambientes multi-threading
 *   
 *   ❌ Desvantagem: 
 *      - O código fica mais difícil de ler 
 *      - Dependência do "volatile": para funcionar é obrigatório o uso da variável volatile
 *   
 *     
 *   
 * */

public class SingletonThreadSafe {

    private static volatile SingletonThreadSafe instancia;

    private int contador = 0;

    private SingletonThreadSafe() {
        System.out.println("[ThreadSafe] Instancia criada com seguranca");
    }

    public static SingletonThreadSafe getInstance() {
        if (instancia == null) {                          // 1a checagem
            synchronized (SingletonThreadSafe.class) {
                if (instancia == null) {                  // 2a checagem
                    instancia = new SingletonThreadSafe();
                }
            }
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
