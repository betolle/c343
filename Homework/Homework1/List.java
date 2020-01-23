
    class EmptyListE extends Exception {}

        abstract class List<E> {
            abstract boolean isEmpty();

            abstract boolean isSingleton();

            abstract E getFirst() throws EmptyListE;

            abstract List<E> getRest() throws EmptyListE;

            abstract E get(int index) throws EmptyListE;

            abstract int length();

            abstract List<E> append(List<E> other);

            abstract boolean contains(E elem);
        }

        class EmptyL<E> extends List<E> {

            public boolean isEmpty() {
                return true;
            }

            public boolean isSingleton() {
                return false;
            }

            public E getFirst() {

                throw new IllegalArgumentException("EmptyListE");
            }

            public List<E> getRest() {

                throw new IllegalArgumentException("EmptyListE");
            }

            public E get(int index) {

                throw new IllegalArgumentException("EmptyListE");
            }

            public int length() {
                return 0;
            }

            public List<E> append(List<E> other) {

                return other;

            }

            public boolean contains(E elem) {

                return false;

            }


        }


        class NodeL<E> extends List<E> {

            E first;
            List<E> rest;

            NodeL(E f, List<E> r) {
                this.first = f;
                this.rest = r;
            }

            public boolean isEmpty() {
                return false;
            }

            public boolean isSingleton() {
                if (rest.isEmpty()) {
                    return true;
                } else {
                    return false;
                }
            }

            public E getFirst() {

                return first;
            }

            public List<E> getRest() {

                return rest;
            }

            public E get(int index) throws EmptyListE {

                if (index == 0) {
                    return first;
                } else {
                    return rest.get(index - 1);
                }

            }

            public int length() {
                if (rest.isEmpty()) {
                    return 1;
                } else {
                    return 1 + rest.length();
                }
            }

            public List<E> append(List<E> other) {

                return new NodeL(first, rest.append(other));

            }

            public boolean contains(E elem) {
    Boolean result = false;

                if (elem == first) {
                    result = true;

                } else if (!rest.isEmpty()) {
                    rest.contains(elem);
                }


                return result;
            }

        }
