package pattern.creational.singleton.lazy;

public class Singleton {
    private static Singleton instance;

    //private constructor, can't create outer example
    private Singleton(){}

    //global point
    public static Singleton getInstance(){
        if (instance==null){
            instance = new Singleton();
        }
        return instance;
    }
}
