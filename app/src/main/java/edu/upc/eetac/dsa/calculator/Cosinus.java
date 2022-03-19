package edu.upc.eetac.dsa.calculator;

public class Cosinus implements Operation{
    @Override
    public double operation(double a, double b) {
        double res = Math.cos(a);
        if(b == 0)//0 = rad
            return Math.toRadians(res);
        else
            return Math.toDegrees(res);
    }
}
