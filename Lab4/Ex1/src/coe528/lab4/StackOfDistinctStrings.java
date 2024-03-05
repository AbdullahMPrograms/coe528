package coe528.lab4;

/**
 *
 * @author AbdullahPC
 */
import java.util.ArrayList;

public class StackOfDistinctStrings {
// Overview: StacksOfDistinctStrings are mutable, bounded
// collection of distinct strings that operate in
// LIFO (Last-In-First-Out) order.
//
// The abstraction function is:
// a) Write the abstraction function here
// AF(c) = a stack of strings, where the i strings in c.items from the top is the i-th string in the stack.
//
//
//
// The rep invariant is:
// b) Write the rep invariant here
// RI(c) = c.items != null && for all i, j (0 <= i, j < c.items.size(), i != j) => c.items.get(i) != c.items.get(j)
//
//
//
//the rep

    private ArrayList<String> items;
// constructor

    public StackOfDistinctStrings() {
// EFFECTS: Creates a new StackOfDistinctStrings object
        items = new ArrayList<String>();
    }

    public void push(String element) throws Exception {
// MODIFIES: this
// EFFECTS: Appends the element at the top of the stack
// if the element is not in the stack, otherwise
// does nothing.
        if (element == null) {
            throw new Exception();
        }
        if (false == items.contains(element)) {
            items.add(element);
        }
    }

    public String pop() throws Exception {
// MODIFIES: this
// EFFECTS: Removes an element from the top of the stack
        if (items.size() == 0) {
            throw new Exception();
        }
        return items.remove(items.size() - 1);
    }

    public boolean repOK() {
// EFFECTS: Returns true if the rep invariant holds for this
// object; otherwise returns false
// c) Write the code for the repOK() here
        // Check that items is not null
        if (items == null) {
            return false;
        }

        // Check that all strings in items are distinct
        for (int i = 0; i < items.size(); i++) {
            for (int j = i + 1; j < items.size(); j++) {
                if (items.get(i).equals(items.get(j))) {
                    return false;
                }
            }
        }

        // If none of the checks failed, the rep invariant holds
        return true;
    }

    public String toString() {
// EFFECTS: Returns a string that contains the strings in the
// stack and the top element. Implements the
// abstraction function.
// d) Write the code for the toString() here
        // Implement the abstraction function
        StringBuilder sb = new StringBuilder();
        sb.append("Stack: ");
        for (int i = items.size() - 1; i >= 0; i--) {
            sb.append(items.get(i));
            if (i > 0) {
                sb.append(", ");
            }
        }
        sb.append("\nTop: ");
        if (!items.isEmpty()) {
            sb.append(items.get(items.size() - 1));
        }
        return sb.toString();
    }
}
