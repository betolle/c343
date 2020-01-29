import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.*;

public class LinkedListTest {

    private Random rand;
    private int len;
    private LinkedList<Integer> empty, one, two, three, many;
    private LinkedList<> EmptyL;


    @Before
    public void setUp() throws Exception {
        rand = new Random(1);
        empty = new EmptyL<>();
        one = new LinkedList(5, EmptyL);
        two = new LinkedList(4, new LinkedList(5, EmptyL));
        three = new LinkedList<>(10, new LinkedList<>(20, new LinkedList<>(30, EmptyL)));
        len = 4999;
        many = new EmptyL<>();
        for (int i=0; i<len; i++) {
            many = new LinkedList<>(rand.nextInt(), many);
        }
    }

    @After
    public void tearDown() throws Exception {
            rand = null;
            empty = null;
            one = null;
            two = null;
            three = null;
            len = 0;
            many = null;

    }

    @Test
    public void clear() {
          assertEquals(null, one.clear());
            assertEquals(null, empty.clear());
            assertEquals(null, three.clear());
            assertEquals(null, many.clear());
    }

    @Test
    public void size() {
            assertEquals(1, one.size());
            assertEquals(3, three.size());
            assertEquals(len, many.size());


    }

    @Test
    public void addFirst() {

        //testing when outputs a void?

            assertEquals(two, one.addFirst(4));

        }

    @Test
    public void addLast() {
            //testing when outputs a void?

        }

    @Test
    public void getFirst() {
            assertEquals((Integer) 5, one.getFirst());
            assertEquals((Integer) 4, two.getFirst());
            assertEquals((Integer) 10, three.getFirst());
        }

    @Test
    public void getLast() {
            assertEquals((Integer) 5, one.getLast());
            assertEquals((Integer) 5, two.getLast());
            assertEquals((Integer) 30, three.getLast());


    }

    @Test
    public void removeFirst() {


        }
    }
}
