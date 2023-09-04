package oop.polynomials;

public interface Poly {
    double coefficient(int t);

    double[] coefficients();
    int degree();
    Poly derivative();
}
