package pattern.singleton.eager;

public class EagerSingleton {
    private static final EagerSingleton INSTANCE = new EagerSingleton();

    EagerSingleton(){}

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }
}
