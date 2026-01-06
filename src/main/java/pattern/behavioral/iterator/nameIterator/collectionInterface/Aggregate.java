package pattern.behavioral.iterator.nameIterator.collectionInterface;

import pattern.behavioral.iterator.nameIterator.iteratorInterface.Iterator;

public interface Aggregate<T> {
    Iterator<T> createIterator();
}
