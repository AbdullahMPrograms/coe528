package coe528.lab4;

/**
 *
 * @author AbdullahPC
 */
import java.util.LinkedList;

public class Queue<T> {
    private LinkedList<T> elements;

    /**
     * Constructs an empty queue.
     */
    public Queue() {
        elements = new LinkedList<>();
    }

    /**
     * Adds an element to the rear end of the queue.
     * @param element the element to add
     */
    public void enqueue(T element) {
        elements.addLast(element);
    }

    /**
     * Removes an element from the front end of the queue.
     * @return the removed element
     * @throws IllegalStateException if the queue is empty
     */
    public T dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Cannot dequeue from an empty queue.");
        }
        return elements.removeFirst();
    }

    /**
     * Checks if the queue is empty.
     * @return true if the queue is empty, false otherwise
     */
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * Returns a string representation of the queue's elements.
     * @return a string representation of the queue's elements
     */
    @Override
    public String toString() {
        return elements.toString();
    }

    /**
     * Checks if the rep invariant holds true for the current state of the queue.
     * @return true if the rep invariant holds true, false otherwise
     */
    public boolean repOK() {
        // The rep invariant is that elements cannot be null.
        return elements != null;
    }
}