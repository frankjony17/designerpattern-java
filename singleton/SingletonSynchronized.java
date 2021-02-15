package singleton;

public class SingletonSynchronized {

    private static SingletonSynchronized INSTANCE = null;

    private SingletonSynchronized() {
    }

    public static SingletonSynchronized getInstance() {
        if (INSTANCE == null)
            synchronized (SingletonSynchronized.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonSynchronized();
                }
            }

        return INSTANCE;
    }
}