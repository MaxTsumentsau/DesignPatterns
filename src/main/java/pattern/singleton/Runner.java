package pattern.singleton;

import pattern.singleton.eager.EagerSingleton;
import pattern.singleton.enums.EnumSingleton;
import pattern.singleton.lazy.Singleton;
import pattern.singleton.multiThreading.MultiThreadingSingleton;

public class Runner {
    public static void main(String[] args) {
        var eagerSingleton1 = EagerSingleton.getInstance();
        var eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton1==eagerSingleton2);

        var lazy1 = Singleton.getInstance();
        var lazy2 = Singleton.getInstance();
        System.out.println(lazy1==lazy2);

        var enum1 = EnumSingleton.INSTANCE;
        var enum2 = EnumSingleton.INSTANCE;
        System.out.println(enum1==enum2);

        Thread thread1 = new Thread(()->{
            var mt1 = MultiThreadingSingleton.getInstance();
            System.out.println("Поток 1 получил экземпляр с id: " + mt1.toString());
        });

        Thread thread2 = new Thread(()->{
            var mt2 = MultiThreadingSingleton.getInstance();
            System.out.println("Поток 2 получил экземпляр с id: " + mt2.toString());
        });
        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
            throw new RuntimeException(e);
        }
    }
}
