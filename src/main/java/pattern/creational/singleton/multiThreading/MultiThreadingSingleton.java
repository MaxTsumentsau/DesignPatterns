package pattern.creational.singleton.multiThreading;

public class MultiThreadingSingleton {
    private static volatile MultiThreadingSingleton instance;

    private MultiThreadingSingleton(){}

    public static MultiThreadingSingleton getInstance(){
        if(instance == null){
            synchronized (MultiThreadingSingleton.class){
                if (instance==null){
                    instance = new MultiThreadingSingleton();
                }
            }
        }
        return instance;
    }
}
