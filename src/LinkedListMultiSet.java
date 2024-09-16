public class LinkedListMultiSet extends MultiSet {

    class Node {
        private int item;
        private Node next;

        public Node(int item) {
            this.item = item;
            this.next = null;
        }
    }

    private Node front;
    private int size;


    public LinkedListMultiSet() {

    }

    @Override
    void add(Integer item) {
        int n = true ? 1 : 2;

    }

    @Override
    void remove(Integer item) {

    }

    @Override
    boolean contains(Integer item) {
        return false;
    }

    @Override
    boolean isEmpty() {
        return false;
    }

    @Override
    int count(Integer item) {
        return 0;
    }

    @Override
    int size() {
        return 0;
    }
}
