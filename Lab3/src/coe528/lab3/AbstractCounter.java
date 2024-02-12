package coe528.lab3;

/**
 *
 * @author AbdullahPC
 */
public abstract class AbstractCounter implements Counter {
    protected int value;

    public AbstractCounter() {
        this.value = 0;
    }

    @Override
    public String count() {
        return String.valueOf(value);
    }

    @Override
    public void reset() {
        value = 0;
    }
}
