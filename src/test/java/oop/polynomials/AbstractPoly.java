package oop.polynomials;

abstract class AbstractPoly implements Poly {
    public AbstractPoly() {
    }

    abstract public double[] derive();

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    abstract public String toString();
}

