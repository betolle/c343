import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Optional;

public class DynamicArray<E> implements StackI<E>, QueueI<E>, DequeI<E> {
    private Optional<E>[] elements;
    private int capacity, front, back, size;
    //
    // data stored in locations:
    // front+1, front+2, ... back-2, back-1 (all mod capacity)
    //
    // common cases:
    // front points to an empty location
    // back points to an empty location
    // adding to front decreases 'front' by 1
    // adding to back increases 'back' by 1
    // removing does the opposite
    // removing to front increases 'front' by 1
    // removing to back decreases 'back' by 1
    //
    // |-------------------------|
    // | 4 5 6 _ _ _ _ _ _ 1 2 3 |
    // |-------------------------|
    //         /\        /\      /\
    //        back      front  capacity
    //

    @SuppressWarnings("unchecked")
    DynamicArray (int initialCapacity) {
        elements = (Optional<E>[]) Array.newInstance(Optional.class, initialCapacity);
        Arrays.fill(elements, Optional.empty());
        capacity = initialCapacity;
        front = capacity - 1;
        back = 0;
        size = 0;
    }

    // Complete the definitions of the following methods from the interfaces

    @Override
    public void clear() {
    elements = Optional.empty();

    }

    public int size () {
        //every time something is added    ->  + 1
        //every time something is removed  ->  - 1
	return size;
    }


    // updates the current stack by adding the given element to the front
    public void push(E item) {
        //resize
        if (size >= ((capacity * 2)/ 3)) {
            elements = (Optional<E>[]) Array.newInstance(Optional.class, capacity * 2);
            Arrays.fill(elements, Optional.empty());
        }
        elements[front] =(Optional<E>) item;
        front = front - 1;
        size = size + 1;
    }

    // returns but does not remove the element at the top of the stack
    public E peek() throws NoSuchElementE {
        return (E)elements[front + 1];
    }

    //output and remove from top
    public E pop() throws NoSuchElementE {
        front = front + 1;
        E popped = (E)elements[front];
        elements[front] = Optional.empty();
        size = size - 1;

        return popped;
    }

    
    // updates the current queue by adding the given element of the end of the queue
    public void offer(E elem) {
        //resize
        if (size >= ((capacity * 2)/ 3)) {
            elements = (Optional<E>[]) Array.newInstance(Optional.class, capacity * 2);
            Arrays.fill(elements, Optional.empty());
        }

        elements[back] =(Optional<E>) elem;
        back = back + 1;
        size = size + 1;
    }
    
    
    // returns but does not remove the element at the front of the queue
    public E poll() throws NoSuchElementE {
        return (E)elements[front + 1];
    }

    // updates the current queue by removing the element at the front; return it as well
    public E remove() throws NoSuchElementE {
        front = front + 1;
         E removed = (E)elements[front];
         elements[front] = Optional.empty();
        size = size - 1;
        return removed;
    }

    public void addFirst(E elem) {
        elements[front] = (Optional<E>) elem;
        front = front - 1;
        size = size + 1;
    }

    public void addLast(E elem) {
        elements[back] = (Optional<E>) elem;
        back = back + 1;
        size = size + 1;
    }

    public E getFirst() throws NoSuchElementE {
        if(size == 0){
            throw new NoSuchElementE();
        } else {
            E first = (E) elements[front + 1];
            return first;
        }
    }

    public E getLast() throws NoSuchElementE {
        if (size == 0) {
            throw new NoSuchElementE();
        } else {
            E last = (E) elements[back - 1];
            return last;
        }
    }

    public E removeFirst() throws NoSuchElementE {
        if (size == 0) {
            throw new NoSuchElementE();
        } else {
            front = front + 1;
            size = size - 1;

            E first = (E) elements[front];
            elements[front] = Optional.empty();
            return first;

        }
    }

    public E removeLast() throws NoSuchElementE {
        if (size == 0) {
            throw new NoSuchElementE();
        } else {
            back = back - 1;
            size = size - 1;

            E last = (E) elements[back];
            elements[back] = Optional.empty();
            return last;

        }
    }


    // the following methods are used for debugging and testing;
    // please do not edit them

    Optional<E>[] getElements () { return elements; }

    int getCapacity () { return capacity; }

    int getFront () { return front; }

    int getBack () { return back; }

}
