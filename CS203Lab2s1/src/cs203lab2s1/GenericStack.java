package cs203lab2s1;

import java.util.*;

class GenericStack<E> extends ArrayList<E> {

    

    /**
     * Push a new element into the top of the stack
     */
    public void push(E value) {
        this.add(value);
    }

    /**
     * Return and remove the top element from the stack
     */
    public E pop() {
        return this.remove(size() - 1);
    }

    /**
     * Return the top element from the stack
     */
    public E peek() {
        return this.get(size() - 1);
    }

    /**
     * Exercise03_21 whether the stack is empty
     */
    public boolean isEmpty() {
        return size() == 0;
    }

    /**
     * Return the number of elements in the stack
     */
    public int getSize() {
        
        return size();
    }

    public static void main(String[] args) {
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("fun!");
        stack1.push("is");
        stack1.push("Java");

        while (stack1.isEmpty() == false) {
            System.out.print(stack1.pop() + " ");
        }

        System.out.println();

        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(4);
        stack2.push(3);
        stack2.push(2);
        stack2.push(1);

        while (!stack2.isEmpty()) {
            System.out.print(stack2.pop() + " ");
        }
        System.out.println();
    }
}
