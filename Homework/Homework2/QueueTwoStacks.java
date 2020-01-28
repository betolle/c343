// Complete the implementation of this class
// For this implementation all the methods should take amortized O(1) time

class QueueTwoStacks<E> implements QueueI<E> {
    private StackList<E> front, back;

    QueueTwoStacks () {
        front = new StackList<>();
        back = new StackList<>();
    }

    public void clear() {
        front.clear();
        back.clear();
    }

    public void offer(E elem) {
        // Move all elements from front to back
        while (!front.empty())
        {
            back.push(front.pop());

        }

        // push elem
        front.push(elem);

        // Push everything back to front
        while (!back.empty())
        {
            front.push(back.pop());

        }
    }

    public E poll() throws NoSuchElementE {
        if(front.empty()){
            throw new NoSuchElementE;
        } else{
            E x = front.peek();
            front.pop();
            return x;
        }
    }

    public E remove() throws NoSuchElementE {
        return null;
    }

    public int size() {

        boolean thrown = false;
        try {
            front.peek();
        } catch (NoSuchElementE e) {
            thrown = true;
        }

        if(thrown){
return 0;
        } else {
            return  1  + front.rest.size();
        }

    }

}
