package coe528.lab3;

/**
 *
 * @author AbdullahPC
 */
public class LinkedDigitCounter extends AbstractCounter {
    private Counter leftNeighbor;

    public LinkedDigitCounter(Counter leftNeighbor) {
        this.leftNeighbor = leftNeighbor;
    }

    @Override
    public void increment() {
        if (value < 9) {
            value++;
        } else {
            value = 0;
            leftNeighbor.increment();
        }
    }

    @Override
    public void decrement() {
        if (value > 0) {
            value--;
        } else {
            value = 9;
            leftNeighbor.decrement();
        }
    }
}