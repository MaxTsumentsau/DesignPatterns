package pattern.behavioral.iterator.nameIterator.concreteCollection;

import pattern.behavioral.iterator.nameIterator.collectionInterface.Aggregate;
import pattern.behavioral.iterator.nameIterator.concreteIterator.NameIterator;
import pattern.behavioral.iterator.nameIterator.iteratorInterface.Iterator;

import java.util.ArrayList;
import java.util.List;

public class NameCollection implements Aggregate<String> {
    private List<String> names = new ArrayList<>();

    public void addName(String name){
        names.add(name);
    }

    @Override
    public Iterator<String> createIterator() {
        return new NameIterator(names);
    }
}
