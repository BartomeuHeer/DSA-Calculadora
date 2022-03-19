package edu.upc.eetac.dsa.calculator;

public class Product implements Operation{
    @Override
    public double operation(double a, double b) {
        return a*b;
    }
}
