package application;


import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do dólar? ");
        double dolarPrice = sc.nextDouble();
        System.out.print("Quantos dólares serão comprados? ");
        double byPrice = sc.nextDouble();

        System.out.printf(STR."Valor a ser pago em reais = \{String.format("%.2f", CurrencyConverter.valorDeReal(dolarPrice, byPrice))}");

        sc.close();
    }
}