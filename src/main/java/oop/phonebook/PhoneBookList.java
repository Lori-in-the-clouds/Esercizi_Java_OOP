package oop.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookList implements PhoneBook {
    static final int MAX_PERSON = 256;
    final ArrayList<Person> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public boolean addPerson(Person p) {
       if (phoneBook.contains(p)) return false;
       if (phoneBook.size() >= MAX_PERSON) {
           return false;
       }
       return phoneBook.add(p);
    }

    @Override
    public boolean removePerson(Person p) {
        return phoneBook.remove(p);
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();
        for (Person i : phoneBook) {
            if (i.getLastname().equals(lastname)) {
                tmp.add(i);
            }
        }
        return tmp.toArray(new Person[]{});
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        ArrayList<Person> tmp = new ArrayList<>();
        for (Person i : phoneBook) {
            if (i.getLastname().equals(lastname) && i.getName().equals(name)) {
                tmp.add(i);
            }
        }
        return tmp.toArray(new Person[]{});
    }
}
