package Iterator;

import java.util.Iterator;

public class IteratirExample2 <T> implements Iterable<T> {


    /*  для того что бы наша колекция поддерживала возможность итерироватся через цикл for(i)
    интерфейс     implements Iterable<T> с дженерик типом <>
    for(i) форичь :)
    override iterator - будет исполтзоватся в цикле for(i)
    используем для чтения
    * */



    private T[] objects;
    private int size;

    public IteratirExample2(int initialSize){
        this.objects = (T[]) new Object[initialSize];
    }

    public void add (T element) {
        objects[size++] = element;
    }

    public T get(int index){
        return objects[index];
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }

    // внутрений класс
    private class ListIterator implements Iterator<T>{

        private int currentIndex;

        @Override
        public boolean hasNext() {
            return currentIndex < size;
        }

        @Override
        public T next() {
            return objects[currentIndex++];
        }
    }
}
