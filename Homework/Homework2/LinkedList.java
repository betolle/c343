// Complete the implementation of this class

class LinkedList<E> implements LinkedListI<E> {
    private List<E> elements;
    private LinkedList<E> EmptyL;

    LinkedList () {
        elements = new EmptyL<>();
    }

    private E data;
    private LinkedList<E> next;

    LinkedList (E data, LinkedList<E> next) {
        this.data = data;
        this.next = next;
    }

    public void clear() {

       data = null;
    }

    public int size() {
        if(data == null){
            return   0;
        }
        else {

            return 1 + next.size();

        }

    }

    public void addFirst(E elem) {

    new LinkedList<E>(elem, new LinkedList<E>(data, next));

    }

    public void addLast(E elem) {

        new LinkedList<E>(data, new LinkedList (next, new LinkedList(elem, EmptyL));

    }

    public E getFirst() throws NoSuchElementE {
        return data;
    }



    //need help implementing, need isEmpty?
    public E getLast() throws NoSuchElementE {
        if(next.isEmpty(); ) {
return data;
        } else {
            next.getLast();
        }
    }

    //return list??
    public E removeFirst() throws NoSuchElementE {

        return new LinkedList<E>(next.getFirst(), next.removeFirst());
    }
}
