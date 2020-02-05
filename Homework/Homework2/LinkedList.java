// Complete the implementation of this class

class LinkedList<E> implements LinkedListI<E> {
    private List<E> elements;


    LinkedList () {
        elements = new EmptyL<>();
    }



    public void clear() {

       elements = new EmptyL<>();
    }

    public int size() {
        if(elements.isEmpty()){
            return   0;
        }
        else {
            return 1 + elements.getRest().size();
        }

    }

    public void addFirst(E elem) {
    elements = new NodeL<>(elem,elements);

    }

    public void addLast(E elem) {
         elements.addLast(elem);

    }

    public E getFirst() throws NoSuchElementE {
        return elements.getFirst();
    }



    public E getLast() throws NoSuchElementE {
        return elements.getLast();
    }


    public E removeFirst() throws NoSuchElementE {
        if (elements.isEmpty()) {
            throw new NoSuchElementE();
        } else {
            elements = elements.getRest();
            return elements.getFirst();
        }
    }
