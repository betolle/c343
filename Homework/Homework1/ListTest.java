import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ListTest {
    public List<Integer> A = new EmptyL<Integer>();
public List<Integer> B = new NodeL<Integer>(4, A);
public List<Integer> C = new NodeL<Integer>(0, B);

    @Test
    public void isEmpty() {
        assertEquals(true, List.isEmpty(A));
        assertEquals(false, List.isEmpty(B));
        assertEquals(false, List.isEmpty(C));
    }

    @Test
    public void isSingleton() {
        assertEquals(false, List.isSingleton(A));
        assertEquals(true, List.isSingleton(B));
        assertEquals(false, List.isSingleton(C));
    }

    @Test
    public void getFirst() {
        //expect error assertEquals(, getFirst(A));
        assertEquals(4, List.getFirst(B));
        assertEquals(0, List.getFirst(C));
    }

    @Test
    public void getRest() {
        //expect error
        //expect error
        assertEquals(4, List.getRest(C));

    }

    @Test
    public void get() {
        assertEquals(4, B.get(0));
        assertEquals(0, C.get(0));
        assertEquals(4, C.get(1));
    }

    @Test
    public void length() {
        assertEquals(0, A.length());
        assertEquals(1, B.length());
        assertEquals(2, C.length());


    }

    @Test
    public void append() {
    }

    @Test
    public void contains() {
        assertEquals(false, A.contains(2));
        assertEquals(false, B.contains(2));
        assertEquals(true ,B.contains(4));
        assertEquals(true ,B.contains(4));
        assertEquals(false, C.contains(2));
        assertEquals(true, C.contains(4));
}

}

