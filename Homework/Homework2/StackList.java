// Complete the implementation of this class

class StackList<E> implements StackI<E> {
    private List<E> elements;


    StackList() {
        elements = new EmptyL<>();
    }



    public void clear() {
elements = new EmptyL<>();
    }

    public boolean empty() {
        if(elements.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public E peek() throws NoSuchElementE {
        if(elements.isEmpty()) {
           throw new NoSuchElementE;
        } else {
            return elements.getFirst();
        }
    }

    public E pop() throws NoSuchElementE {
        if (elements.isEmpty()) {
            throw new NoSuchElementE();
        } else {
            E popped = elements.getFirst();
            List<E> rest = elements.getRest();
            E newTop = rest.getFirst();
            elements = new NodeL<>(newTop, rest);
            return popped;
        }
    }

    public void push(E item) {
elements = new NodeL<>(item, elements);
    }
}
