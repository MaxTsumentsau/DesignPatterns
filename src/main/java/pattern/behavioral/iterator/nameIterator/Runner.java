package pattern.behavioral.iterator.nameIterator;

import pattern.behavioral.iterator.nameIterator.concreteCollection.NameCollection;
import pattern.behavioral.iterator.nameIterator.iteratorInterface.Iterator;

public class Runner {
    public static void main(String[] args) {
        NameCollection collection = new NameCollection();
        collection.addName("Sasha");
        collection.addName("Masha");
        collection.addName("Dasha");
        collection.addName("Pasha");

        Iterator<String> iterator = collection.createIterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
