package oop.polynomials;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class ListPolyTest extends AbstractPolyTest {
    @BeforeEach
    void setUp() {
        p = new ListPoly(new double[]{1, 2, 3, 4});
    }
}