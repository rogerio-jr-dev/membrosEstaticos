package util;

public class CurrencyConverter {

    public static final double IOF = 0.06;

    public static double valorDeReal(double priceDolar, double quantity){
        double iof = priceDolar * quantity * IOF;
        return priceDolar * quantity + iof;
    }
}
