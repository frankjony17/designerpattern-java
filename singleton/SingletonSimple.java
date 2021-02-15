package singleton;

public final class SingletonSimple {
    private static SingletonSimple INSTANCE = null;

    private SingletonSimple() {}

    public static SingletonSimple getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new SingletonSimple();
        }
        return INSTANCE;
    }

    public String getText () {
        return "TESTE OK\n";
    }
}