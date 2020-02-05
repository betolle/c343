// Complete the implementation of this class

class SetList<E> implements SetI<E> {
    private List<E> elements;

    SetList () {
        elements = new EmptyL<>();
    }


    public void clear() {

        elements = new EmptyL<>();
    }

    public boolean isEmpty() {
        if(elements.isEmpty()){
            return true;
        }else {
            return false;
        }
    }

    public void add(E elem)  {
        if(contains(elem)){
            System.out.println("Already Contains, Cannot be added.");
        } else {
            elements  = new NodeL<>(elem,  elements);
        }

    }

    public boolean contains(E elem) {
        //O(n)
       if(elements.contains(elem)){
           return true;
       }  else {
           return false;
       }
    }

    public int size() {
        if(elements.isEmpty()){
            return 0;
        }else {
            return 1 + elements.getRest().size();
        }
    }

}
