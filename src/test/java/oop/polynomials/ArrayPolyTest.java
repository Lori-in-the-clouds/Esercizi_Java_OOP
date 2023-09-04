package oop.polynomials;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ArrayPolyTest extends AbstractPolyTest{
    @BeforeEach
    void setUp() {
        p = new ArrayPoly(new double[]{1, 2, 3, 4});
    }

}