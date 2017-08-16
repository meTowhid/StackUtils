package icurious.stackutils;

import java.text.NumberFormat;

/**
 * Created by Towhid on 7/24/17.
 */

public class Money {
    private static final Money ourInstance = new Money();
    private NumberFormat nf = NumberFormat.getInstance();

    public static Money getInstance() {
        return ourInstance;
    }

    private Money() {
    }

    public String formatMoney(double amount) {
        return nf.format(amount) + " ৳";
    }

}
