import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;    import org.junit.Assert;
    import org.junit.Test;

    import static org.junit.Assert.*;

    public class ListTest {
         List<Integer> A = new EmptyL<>();
         List<Integer> B = new NodeL(4, A);
         List<Integer> C = new NodeL(0, B);
         List<Integer> D = new NodeL(3, C);

        List<String> S1 = new EmptyL<>();
        List<Integer> S2 = new NodeL("world", S1);
        List<Integer> S3 = new NodeL("hello", S2);

        @Test
        public void isEmpty() {
            assertEquals(true, A.isEmpty());
            assertEquals(false, B.isEmpty());
            assertEquals(false, C.isEmpty());
            assertEquals(true, S1.isEmpty());
            assertEquals(false, S2.isEmpty());
        }

        @Test
        public void isSingleton() {
            assertEquals(false, A.isSingleton());
            assertEquals(true, B.isSingleton());
            assertEquals(false, C.isSingleton());
            assertEquals(true, S2.isSingleton());
            assertEquals(false, S3.isSingleton());
            assertEquals(false, S1.isSingleton());
        }

        @Test
        public void getFirst() {


            try { assertEquals((Integer) 0, A.getFirst());
                fail();
            }
            catch (Exception e) { }
            try { assertEquals((Integer)4, B.getFirst()); }
            catch (Exception e) {
                fail(); }
            try { assertEquals((Integer)0, C.getFirst()); }
            catch (Exception e) {
                fail(); }
        }

        @Test
        public void getRest() {

            try {
                assertEquals(0, A.getRest());
                fail();
            } catch (Exception e) {
            }
            try {
                assertEquals(A, B.getRest());
            } catch (Exception e) {
                fail();
            }
            try {
                assertEquals(B, C.getRest());
            } catch (Exception e) {
                fail();
            }
        }

        @Test
        public void get() {

            try { assertEquals((Integer)4, B.get(0)); }
            catch (Exception e) {
                fail(); }
            try { assertEquals((Integer)0, C.get(0)); }
            catch (Exception e) {
                fail(); }
            try { assertEquals((Integer)4, C.get(1)); }
            catch (Exception e) {
                fail(); }
            try { assertEquals((Integer)0, C.get(4));
                fail(); }
            catch (Exception e)  { }
            try { assertEquals((Integer)0, B.get(4));
                fail();}
            catch (Exception e) { }
            try { assertEquals((Integer)0, A.get(4));
                fail(); }
            catch (Exception e) { }
        }

        @Test
        public void length() {
            assertEquals(0, A.length());
            assertEquals(1, B.length());
            assertEquals(2, C.length());
            assertEquals(3, D.length());
            assertEquals(0, A.append(A).length());
            assertEquals(2, S3.length());
            assertEquals(0, S1.length());
        }

        @Test
        public void append() {
            assertEquals(A, A.append(A));
            assertEquals(B, A.append(B));
            assertEquals(C, A.append(C));

        }

        @Test
        public void contains() {
            assertEquals(false, A.contains(2));
            assertEquals(false, B.contains(2));
            assertEquals(false, A.contains(4));
            assertEquals(true, B.contains(4));
            assertEquals(false, C.contains(2));
            assertEquals(true, C.contains(0));

        }
    }

public class ListTest {
     List<Integer> A = new EmptyL<>();
     List<Integer> B = new NodeL(4, A);
     List<Integer> C = new NodeL(0, B);

    @Test
    public void isEmpty() {
        assertEquals(true, A.isEmpty());
        assertEquals(false, B.isEmpty());
        assertEquals(false, C.isEmpty());
    }

    @Test
    public void isSingleton() {
        assertEquals(false, A.isSingleton());
        assertEquals(true, B.isSingleton());
        assertEquals(false, C.isSingleton());
    }

    @Test
    public void getFirst() {
        try { assertEquals((Integer) 0, A.getFirst());
            fail();
        }
        catch (EmptyListE E) {

        }

        try { assertEquals((Integer)4, B.getFirst());
        }
        catch (EmptyListE E) {
            fail();
        }

        try { assertEquals((Integer)0, C.getFirst());
        }
        catch (EmptyListE E) {
            fail();
        }

    }

    @Test
    public void getRest() {

        try { assertEquals(0, A.getRest());
            fail();
        }
        catch (EmptyListE E) {
        }

        try { assertEquals(0, B.getRest());
            fail();
        }
        catch (EmptyListE E) {
        }

        try { assertEquals(4, C.getRest());}
        catch (EmptyListE E) {
            fail();
        }



    }

    @Test
    public void get() {

        try { assertEquals((Integer)4, B.get(0));
        }
        catch (EmptyListE E) {
            fail();
        }


        try { assertEquals((Integer)0, C.get(0));
        }
        catch (EmptyListE E) {
            fail();
        }


        try { assertEquals((Integer)4, C.get(1));
        }
        catch (EmptyListE E) {
            fail();
        }


        try { assertEquals((Integer)0, C.get(4));
            fail();
        }
        catch (EmptyListE E) {

        }

        try { assertEquals((Integer)0, B.get(4));
            fail();
        }
        catch (EmptyListE E) {

        }


        try { assertEquals((Integer)0, A.get(4));
            fail();
        }
        catch (EmptyListE E) {

        }
    }

    @Test
    public void length() {
        assertEquals(0, A.length());
        assertEquals(1, B.length());
        assertEquals(2, C.length());


    }

    @Test
    public void append() {
        assertEquals(A, A.append(A));
        assertEquals(B, A.append(B));

    }

    @Test
    public void contains() {
        assertEquals(false, A.contains(2));
        assertEquals(false, B.contains(2));
        assertEquals(true , B.contains(4));
        assertEquals(true , B.contains(4));
        assertEquals(false, C.contains(2));
        assertEquals(true, C.contains(4));
    }

}
