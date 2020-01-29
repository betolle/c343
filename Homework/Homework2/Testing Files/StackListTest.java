import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class StackListTest {

    private Random rand;
    private int len;
    private StackList<Integer> empt, one, two, three, many;
    private StackList<> EmptyL;

    @Before
    public void setUp() throws Exception {
        rand = new Random(1);
        empt = new EmptyL<>();
        one = new StackList(EmptyL, 5);
        two = new StackList(new StackList(EmptyL, 5), 4);
        three = new StackList<>( new StackList<>( new StackList<>(EmptyL, 30), 20), 10);
        len = 4999;
        many = new EmptyL<>();
        for (int i=0; i<len; i++) {
            many = new StackList<>(many, rand.nextInt());

        }
    }

    @After
    public void tearDown() throws Exception {
            rand = null;
            empt = null;
            one = null;
            two = null;
            three = null;
            len = 0;
            many = null;


    }

    @Test
    public void clear() {
            assertEquals(null, one.clear();
            assertEquals(null, empt.clear();
            assertEquals(null, three.clear();
            assertEquals(null, many.clear();

    }

    @Test
    public void empty() {
            assertEquals(true, empt.empty());
            assertEquals(false, one.empty());
            assertEquals(false, two.empty());
        }

    @Test
    public void peek() {
        try {
            assertEquals((Integer) 0, empt.peek());
            fail();
        } catch (NoSuchElementE noSuchElementE) {
            noSuchElementE.printStackTrace();
        }

        try {
            assertEquals((Integer) 5, one.peek());
        } catch (NoSuchElementE noSuchElementE) {
            noSuchElementE.printStackTrace();
        }

        try {
            assertEquals((Integer) 4, two.peek());
        } catch (NoSuchElementE noSuchElementE) {
            noSuchElementE.printStackTrace();
        }


    }

    @Test
    public void pop() {
    }

    @Test
    public void push() {
        //testing method outputing void
        assertEquals(one, empt.push(5));
        assertEquals(two, one.push(4));

    }

    @Test
    public void size() {
        //????
    }
}
