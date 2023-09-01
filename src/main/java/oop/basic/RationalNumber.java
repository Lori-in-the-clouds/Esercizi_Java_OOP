package oop.basic;

public class RationalNumber {
    static int greatestCommonDivisor(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        int rest = max % min;
        if (max % min == 0) {
            return min;
        } else {
            return greatestCommonDivisor(min, rest);
        }
    }

    static int leastCommonMultiple(int a, int b) {
        return Math.abs(a * b) / greatestCommonDivisor(a, b);
    }
    int numerator;
    int denominator;

    public RationalNumber(int numerator, int denominator) {
        int c = greatestCommonDivisor(numerator,denominator);
        this.numerator = numerator/c;
        this.denominator = denominator/c;
    }

    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public RationalNumber add(RationalNumber o) {
        int dem_mul = leastCommonMultiple(denominator,o.getDenominator());
        return new RationalNumber((numerator*(dem_mul/denominator)) + (o.getNumerator()*(dem_mul/o.getDenominator())),dem_mul);
    }

    public RationalNumber multiply(RationalNumber o) {
        return new RationalNumber(numerator*o.getNumerator(),denominator*o.getDenominator());
    }

    @Override
    public String toString() {
        return "RationalNumber{" +
                "numerator=" + numerator +
                ", denominator=" + denominator +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        RationalNumber that = (RationalNumber) o;
        return numerator == that.numerator && denominator == that.denominator;
    }
}
