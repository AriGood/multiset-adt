public class TreeMultiSet extends MultiSet {

    private Tree tree;

    public TreeMultiSet() {
        tree = new Tree();
    }


    // TODO add a Tree object as a private instance variable for this class.
    /**
     * Add the given item to this multiset.
     *
     * @param item the item to add
     */
    @Override
    void add(Integer item) {

        tree.insert(item);

    }


    @Override
    void remove(Integer item) {
        tree.deleteItem(item);
    }

    @Override
    boolean contains(Integer item) {
        return tree.contains(item);
    }

    @Override
    boolean isEmpty() {
        return tree.isEmpty();
    }

    @Override
    int count(Integer item) {
        return tree.count(item);
    }

    @Override
    int size() {
        return tree.length();
    }


}
