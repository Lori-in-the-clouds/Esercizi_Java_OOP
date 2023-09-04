package oop.library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;

public class Library {
    ArrayList<Rent> rents = new ArrayList<>();

    public Library() {
        new ArrayList<Rent>();
    }

    public Library(ArrayList<Rent> rents) {
        this.rents = rents;
    }

    public boolean addRent(Rent t) {
        return rents.add(t);
    }

    public boolean removeRent(Rent t) {
        return rents.remove(t);
    }
    public ArrayList<Rent> getExpired(LocalDate date) {
        ArrayList<Rent> dst = new ArrayList<>();
        for (Rent i : rents) {
            if (i.isExpired(date)) {
                dst.add(i);
            }
        }
        return dst;
    }
}
