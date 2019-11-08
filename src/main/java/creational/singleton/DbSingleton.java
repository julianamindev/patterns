package creational.singleton;

public class DbSingleton {

    // eagerly loaded
    // private static DbSingleton instance = new DbSingleton();
    // volatile variables instruct JVM threads to read the value of volatile variable from main memory and don’t cache it locally
    // it guarantees that any thread that reads a field will see the most recently written value
    private static volatile DbSingleton instance = null;
    
    private DbSingleton() {
        // prevents from being instantiated through reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static DbSingleton getInstance() {
        // lazily loaded
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }

        return instance;
    }
}
