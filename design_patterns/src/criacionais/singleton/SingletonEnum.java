package criacionais.singleton;

public enum SingletonEnum {

    INSTANCE;

    private int contador = 0;

    public void incrementar() {
        contador++;
    }

    public int getContador() {
        return contador;
    }
}