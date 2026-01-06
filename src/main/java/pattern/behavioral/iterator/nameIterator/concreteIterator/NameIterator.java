package pattern.behavioral.iterator.nameIterator.concreteIterator;

import pattern.behavioral.iterator.nameIterator.iteratorInterface.Iterator;

import java.util.ArrayList;
import java.util.List;

public class NameIterator implements Iterator<String> {
    private List<String> names = new ArrayList<>();
    private int position = 0;

    @Override
    public boolean hasNext() {
        return position < names.size();
    }

    @Override
    public String next() {
        return names.get(position++);
    }

    public NameIterator(List<String> names) {
        this.names = names;
    }
}
