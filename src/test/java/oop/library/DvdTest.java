package oop.library;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DvdTest {
    Dvd dvd;

    @BeforeEach
    void setup() {
        dvd = new Dvd("Moon", 2011, 130);
    }

    @Test
    void getTitle() {
        assertEquals("Moon", dvd.getTitle());
    }

    @Test
    void setTitle() {
        dvd.setTitle("Sun");
        assertEquals("Sun", dvd.getTitle());
    }

    @Test
    void getYear() {
        assertEquals(2011, dvd.getYear());
    }

    @Test
    void setYear() {
        dvd.setYear(2012);
        assertEquals(2012, dvd.getYear());
    }

    @Test
    void getDuration() {
        assertEquals(130, dvd.getLenght());
    }

    @Test
    void setDuration() {
        dvd.setLenght(140);
        assertEquals(140, dvd.getLenght());
    }

    @Test
    void equalsHashCode() {
        Dvd other  = new Dvd("Moon", 2011, 130);
        assertEquals(dvd, other);
        assertEquals(dvd.hashCode(), other.hashCode());
    }
}