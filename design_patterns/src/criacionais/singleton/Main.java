package criacionais.singleton;

public class Main {

    public static void main(String[] args) {
    	
        System.out.println("=== Eager ===");
        SingletonEager e1 = SingletonEager.getInstance();
        SingletonEager e2 = SingletonEager.getInstance();
        e1.incrementar();
        e2.incrementar();
        System.out.println("e1 == e2 ? " + (e1 == e2));
        System.out.println("Contador (deveria ser 2): " + e1.getContator());

        System.out.println("\n=== Lazy ===");
        SingletonLazy l1 = SingletonLazy.getInstance();
        SingletonLazy l2 = SingletonLazy.getInstance();
        System.out.println("l1 == l2 ? " + (l1 == l2));

        System.out.println("\n=== ThreadSafe (Double-Checked Locking) ===");
        SingletonThreadSafe t1 = SingletonThreadSafe.getInstance();
        SingletonThreadSafe t2 = SingletonThreadSafe.getInstance();
        System.out.println("t1 == t2 ? " + (t1 == t2));

        System.out.println("\n=== Enum ===");
        SingletonEnum.INSTANCE.incrementar();
        SingletonEnum.INSTANCE.incrementar();
        SingletonEnum.INSTANCE.incrementar();
        System.out.println("Contador (deveria ser 3): " + SingletonEnum.INSTANCE.getContador());
    }
}