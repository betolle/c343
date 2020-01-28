// Complete the implementation of this class

class SetList<E> implements SetI<E> {
    private List<E> elements;

    SetList () {
        elements = new EmptyL<>();
    }

    private E data;
    private SetList<E> rest;

    SetList (E data, SetList<E> rest) {
        this.data = data;
        this.rest = rest;
    }

    public void clear() {
data = null;
    }

    public boolean isEmpty() {
        if(data == null){
            return true;
        }else {
            return false;
        }
    }

    public void add(E elem)  {
        if(contains(elem)){
            System.out.println("Already Contains, Cannot be added.");
        } else {
            SetList newSet= new SetList(elem, new SetList(data,rest));
        }

    }

    public boolean contains(E elem) {
        boolean result = false;
        for(int i = 0;  i < size(); i++){
            if(data == elem) {
                result = true;
            }
        }
        return result;
    }

    public int size() {
        if(isEmpty()){
            return 0;
        }else {
            return 1 + rest.size();
        }
    }

}
