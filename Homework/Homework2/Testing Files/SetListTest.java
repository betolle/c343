import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;
import static org.junit.Assert.*;

public class SetListTest {
    private Random rand;
    private int len;
    private SetList<Integer> empty, nullSet, one, two, three, many;
    private SetList<> EmptyL;




    @Before
    public void setUp() throws Exception {
        rand = new Random(1);
        empty = new EmptyL<>();
        nullSet = new SetList(null, null);
        one = new SetList(5, EmptyL);
        two = new SetList(4, new SetList(5, EmptyL));
        three = new SetList<>(10, new SetList<>(20, new SetList<>(30, EmptyL)));
        len = 4999;
        many = new EmptyL<>();
        for (int i=0; i<len; i++) {
            many = new SetList<>(rand.nextInt(), many);
        }
    }

    @After
    public void tearDown() throws Exception {
        rand = null;
        empty = null;
        nullSet = null;
        one = null;
        two = null;
        three = null;
        len = 0;
        many = null;

    }
    @Test
    public void clear() {
        assertEquals(nullSet, one.clear());
        assertEquals(nullSet, empty.clear());
        assertEquals(nullSet, three.clear());
        assertEquals(nullSet, many.clear());
    }

    @Test
    public void isEmpty() {
        assertEquals(true, one.isEmpty());
        assertEquals(true, empty.isEmpty());
        assertEquals(false, three.isEmpty());
        assertEquals(false, many.isEmpty());

    }

    @Test
    public void add() {
       // assertEquals("Already Contains, Cannot be added.", one.add(5));
        assertEquals(one, empty.add(5));
        assertEquals(two, one.add(4));

    }

    @Test
    public void contains() {
        assertEquals(true, one.contains(5));
        assertEquals(true, two.contains(5));
        assertEquals(true, two.contains(4));
        assertEquals(true, three.contains(10));
        assertEquals(true, three.contains(20));
        assertEquals(true, three.contains(30));
        assertEquals(false, three.contains(3));
        assertEquals(false, two.contains(2));
        assertEquals(false, one.contains(1));
        assertEquals(false, empty.contains(3));

    }

    @Test
    public void size() {
        assertEquals(0, empty.size());
        assertEquals(1, one.size());
        assertEquals(2, two.size());
        assertEquals(3, three.size());
        assertEquals(len, many.size());
    }
}
