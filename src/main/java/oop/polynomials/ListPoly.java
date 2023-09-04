package oop.polynomials;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.stream.Collectors;

public class ListPoly extends AbstractPoly {
    ArrayList<Double> coefficients;

    public ListPoly(double[] coefficients) {
       this.coefficients = new ArrayList<Double>();
       for (double i : coefficients) {
           this.coefficients.add(i);
       }
    }

    @Override
    public double coefficient(int grade) {
      return coefficients.get(grade);
    }

    @Override
    public double[] coefficients() {
        double[] dst = new double[coefficients.size()];
        int j=0;
        for (Double i : coefficients) {
            dst[j]=i;
            j++;
        }
        return dst;
    }

    @Override
    public int degree() {
        return coefficients.size()-1;
    }

    @Override
    public Poly derivative() {
        return new ListPoly(derive());
    }
}
