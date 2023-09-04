package oop.library;

import java.time.LocalDate;
import java.util.Objects;

public class Rent {
    Item item;
    Person person;
    LocalDate begin;
    LocalDate end;


    public Rent(Item item, Person person, LocalDate begin, LocalDate end) {
        this.item = item;
        this.person = person;
        this.begin = begin;
        this.end = end;
    }

    public LocalDate getBegin() {
        return begin;
    }

    public void setBegin(LocalDate begin) {
        this.begin = begin;
    }

    public LocalDate getEnd() {
        return end;
    }

    public void setEnd(LocalDate end) {
        this.end = end;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) return true;
        if ( o == null || getClass() != o.getClass() ) return false;
        Rent rent = (Rent) o;
        return Objects.equals(begin, rent.begin) && Objects.equals(end, rent.end) && Objects.equals(item, rent.item) && Objects.equals(person, rent.person);
    }

    @Override
    public int hashCode() {
        return Objects.hash(begin, end, item, person);
    }

    @Override
    public String toString() {
        return "Rent{" +
                "begin=" + begin +
                ", end=" + end +
                ", item=" + item +
                ", person=" + person +
                '}';
    }

    boolean isExpired(LocalDate date) {
        return date.isAfter(end);
    }
}
