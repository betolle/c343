// Complete the implementation of this class
// For this implementation, you can make some of the methods in the interface take O(n) time instead of the expected O(1) time


class QueueList<E> implements QueueI<E> {
    private List<E> elements;



    QueueList() {
        elements = new EmptyL<>();
    }



    public void clear() {
elements = new EmptyL<>();
    }

    //add
    public void offer(E elem) {
elements = new NodeL<>(elem, elements);
    }


    public E poll() throws NoSuchElementE {
        if(elements.isEmpty()){
            throw new NoSuchElementE;
        } else  {
            return elements.getLast();
        }
    }



    public E remove() throws NoSuchElementE {
       if(elements.getRest().isEmpty()) {
           return elements.getFirst();
       } else {
           elements.getRest().remove();
       }

    }

    public int size() {
        if(elements.isEmpty()) {
            return 0;
        }
            return 1  + elements.getRest().size();
        }

    }
}
