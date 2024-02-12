package coe528.lab3;

/**
 *
 * @author AbdullahPC
 */
public class DigitCounter extends AbstractCounter {

    @Override
    public void increment() {
        if (value < 9) {
            value = value + 1;
        } else {
            value = 0;
        }
    }

    @Override
    public void decrement() {
        if (value > 0) {
            value = value - 1;
        } else {
            value = 9;
        }
    }
}
