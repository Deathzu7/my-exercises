package io.codeforall.bootcamp;

public class LinkedList {

    private Node head;

    private int length = 0;

    public LinkedList() {
        this.head = new Node(null);
    }

    public int size() {
        return length;
    }

    /**
     * Adds an element to the end of the list
     *
     * @param data the element to add
     */
    public void add(Object data) {

        Node node = new Node(data);
        Node iterator = head;
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
        length++;

    }

    /**
     * Obtains an element by index
     *
     * @param index the index of the element
     * @return the element
     */
    public Object get(int index) {

        Node batata = head.getNext();

        int counter = 0;

        while (true) {
            if (batata == null) {
                return null;
            }

            if (index == counter) {
                return batata.getData();
            }

            batata = batata.getNext();
            counter++;
        }
    }

    /**
     * Returns the index of the element in the list
     *
     * @param data element to search for
     * @return the index of the element, or -1 if the list does not contain element
     */
    public int indexOf(Object data) {


        Node batata = head.getNext();
        int index = 0;
        while (true) {
            if (batata == null) {
                return -1;
            }
            if (batata.getData() == data) {
                return index;
            }
            batata = batata.getNext();
            index++;

        }
    }

    /**
     * Removes an element from the list
     *
     * @param data the element to remove
     * @return true if element was removed
     */
    public boolean remove(Object data) {
        Node batata = head.getNext();
        Node batata2 = head.getNext();
        int counter = 0;

        while (true) {

            if (batata == null) {
                return false;
            }

            if (batata.getData() == data) {
                for (int i = 0; i < counter; i++) {
                    batata2.getNext();

                }

                batata2.setNext(batata.getNext());
                length--;
                return true;
            }

            batata = batata.getNext();
            counter++;

        }
    }

    private class Node {

        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
            next = null;
        }

        public Object getData() {
            return data;
        }

        public void setData(Object data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }

}
