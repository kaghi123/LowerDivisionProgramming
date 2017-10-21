package lab6s2;

public class Lab6s2myLinkedList<E> extends MyAbstractList<E> {

    private Node<E> head, tail;

    public Lab6s2myLinkedList() {
    }

    public Lab6s2myLinkedList(E[] objects) {
        super(objects);
    }

    public E getFirst() {
        if (size == 0) {
            return null;
        } else {
            return head.element;
        }
    }

    public E getLast() {
        if (size == 0) {
            return null;
        } else {
            return tail.element;
        }
    }

    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e); // Create a new node
        newNode.next = head; // link the new node with the head
        head = newNode; // head points to the new node
        size++; // Increase list size

        if (tail == null) // The new node is the only node in list
        {
            tail = head;
        }
    }

    public void addLast(E e) {
        Node<E> newNode = new Node<>(e); // Create a new node for e

        if (tail == null) {
            head = tail = newNode; // The only node in list
        } else {
            tail.next = newNode; // Link the new node with the last node
            tail = tail.next; // tail now points to the last node
        }

        size++;
    }

    @Override
    public void add(int index, E e) {
        if (index == 0) {
            addFirst(e); // Insert first
        } else if (index >= size) {
            addLast(e); // Insert last
        } else { // Insert in the middle
            Node<E> current = head;
            for (int i = 1; i < index; i++) {
                current = current.next;
            }
            Node<E> temp = current.next;
            current.next = new Node<E>(e);
            (current.next).next = temp;
            size++;
        }
    }

    public E removeFirst() {
        if (size == 0) {
            return null; // Nothing to delete
        } else {
            Node<E> temp = head; // Keep the first node temporarily
            head = head.next; // Move head to point to next node
            size--; // Reduce size by 1
            if (head == null) {
                tail = null; // List becomes empty
            }
            return temp.element; // Return the deleted element
        }
    }

    public E removeLast() {
        if (size == 0) {
            return null;
        } else if (size == 1) { // Only one element in the list
            Node<E> temp = head;
            head = tail = null; // list becomes empty
            size = 0;
            return temp.element;
        } else {
            Node<E> current = head;

            for (int i = 0; i < size - 2; i++) {
                current = current.next;
            }

            Node<E> temp = tail;
            tail = current;
            tail.next = null;
            size--;
            return temp.element;
        }
    }

    @Override
    public E remove(int index) {
        if (index < 0 || index >= size) {
            return null;
        } else if (index == 0) {
            return removeFirst(); // Remove first
        } else if (index == size - 1) {
            return removeLast(); // Remove last
        } else {
            Node<E> previous = head;

            for (int i = 1; i < index; i++) {
                previous = previous.next;
            }

            Node<E> current = previous.next;
            previous.next = current.next;
            size--;
            return current.element;
        }
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");

        Node<E> current = head;
        for (int i = 0; i < size; i++) {
            result.append(current.element);
        }
        current = current.next;
        if (current != null) {
            result.append(", ");
        } else {
            result.append("]");
        }

        return result.toString();
    }

    @Override
    public void clear() {
        size = 0;
        head = tail = null;
    }

    @Override
    public boolean contains(E e) {
        Node<E> temp = head;
        for (int i = 0; i < size; i++) {
            if (e.equals(temp.element)) {
                return true;
            } else {
                temp = temp.next;

            }

        }
        return false;
    }

    @Override
    public E get(int index) {
        
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        }
        
        Node<E> temp = head;

        for (int i = 0; i < size; i++) {
            if (i == index) {
                break;
            } else {
                temp = temp.next;
            }
        }

        return temp.element;
    }

    @Override
    public int indexOf(E e) {
        Node<E> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.element.equals(e)) {
                return i;
            } else {
                temp = temp.next;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(E e) {
        Node<E> temp = head;
        for (int i = size - 1; i >= 0; i--) {
            if (temp.element.equals(e)) {
                return i;
            } else {
                temp = temp.next;
            }
        }
        return -1;
    }

    @Override
    public E set(int index, E e) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("index " + index + " out of bounds");
        }
        
        Node<E> temp = head;
        
        for (int i = 0; i < size; i++) {
            if (i == index) {
                temp.element = e;
            } else {
                temp = temp.next;
            }
        }
        

        return null;
    }

    @Override
    /**
     * Override iterator() defined in Iterable
     */
    public java.util.Iterator<E> iterator() {
        return new LinkedListIterator();

    }

    private class LinkedListIterator
            implements java.util.Iterator<E> {

        private Node<E> current = head; // Current index

        @Override
        public boolean hasNext() {
            return (current != null);
        }

        @Override
        public E next() {
            E e = current.element;
            current = current.next;
            return e;
        }

        @Override
        public void remove() {
            if (current.element.equals(0) || current.element.equals(size)) {
            } else if (current.element.equals(0)) {
                removeFirst(); // Remove first
            } else if (current.equals(size - 1)) {
                removeLast(); // Remove last
            } else {
                Node<E> previous = head;

                for (int i = 1; !current.element.equals(i); i++) {
                    previous = previous.next;
                }

                Node<E> current = previous.next;
                previous.next = current.next;
                size--;
            }
        }
    }
// This class is only used in LinkedList, so it is private.
// This class does not need to access any 
// instance members of LinkedList, so it is defined static.

    private static class Node<E> {

        E element;
        Node<E> next;

        public Node(E element) {
            this.element = element;
        }
    }

}
