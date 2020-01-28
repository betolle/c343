// Complete the implementation of this class

class StackList<E> implements StackI<E> {
    private List<E> elements;
    private StackList EmptyL;

    StackList() {
        elements = new EmptyL<>();
    }


        E data;
    static StackList rest;

    StackList(StackList<E> rest, E data)
        {
            this.rest = rest;
            this.data = data;

        }
    }

    public void clear() {
data = null;
    }

    public boolean empty() {
        if(data == null) {
return true;
        } else {
return false;
        }
    }

    public E peek() throws NoSuchElementE {
        if(data == null) {
           throw new NoSuchElementE;
        } else {
            return data;
        }
    }

    public E pop() throws NoSuchElementE {
        if (empty()) {
            System.out.println("Stack is Empty");
            return null;
        } else {

        }
    }

    public void push(E item) {


        if (empty()) {
            StackList newNode = new StackList(EmptyL, item);
        }
        else {
            StackList newNode = new StackList(new StackList(rest, data),item);

        }
    }
}
