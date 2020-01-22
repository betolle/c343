
class EmptyListE extends Exception {}

abstract class List<E> {
    abstract boolean isEmpty ();
    abstract boolean isSingleton();
    abstract E getFirst() throws EmptyListE;
    abstract List<E> getRest() throws EmptyListE;
    abstract E get (int index) throws EmptyListE;
    abstract int length ();
    abstract List<E> append (List<E> other);
    abstract boolean contains (E elem);
}

abstract class EmptyL<E> extends List<E> {



}



abstract class NodeL<E> extends List<E> {

    private E first;
    private List<E> rest;
    NodeL (E f, List<E> r) {
        this.first = f;
        this.rest = r;
    }


}

