package coe528.lab3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author AbdullahPC
 */
public class Odometer implements Counter {
    private List<Counter> digits;

    public Odometer(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("Number of digits must be at least 1");
        }

        digits = new ArrayList<>();
        digits.add(new DigitCounter());

        for (int i = 1; i < n; i++) {
            digits.add(0, new LinkedDigitCounter(digits.get(0)));
        }
    }

    @Override
    public String count() {
        StringBuilder sb = new StringBuilder();
        for (Counter digit : digits) {
            sb.append(digit.count());
        }
        return sb.reverse().toString();
    }

    @Override
    public void increment() {
        digits.get(0).increment();
    }

    @Override
    public void decrement() {
        digits.get(0).decrement();
    }

    @Override
    public void reset() {
        for (Counter digit : digits) {
            digit.reset();
        }
    }
}