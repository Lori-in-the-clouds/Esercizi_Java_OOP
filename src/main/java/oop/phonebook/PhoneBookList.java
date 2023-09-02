package oop.phonebook;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookList implements PhoneBook {
    static final int MAX_PERSON = 256;
    ArrayList<Person> phoneBook;

    public PhoneBookList() {
        phoneBook = new ArrayList<>();
    }

    @Override
    public boolean addPerson(Person p) {
       if (phoneBook.contains(p)) return false;
       if (phoneBook.size() < MAX_PERSON) {
           phoneBook.add(p);
           return true;
       }
       return false;
    }

    @Override
    public boolean removePerson(Person p) {
        if (phoneBook.contains(p)) {
            phoneBook.remove(p);
            return true;
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        List<Person> tmp = new ArrayList<>();
        for (Person i : phoneBook) {
            if (i.getLastname() == lastname) {
                tmp.add(i);
            }
        }
        return tmp.toArray(new Person[tmp.size()]);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {
        List<Person> tmp = new ArrayList<>();
        for (Person i : phoneBook) {
            if (i.getLastname() == lastname && i.getName() == name) {
                tmp.add(i);
            }
        }
        return tmp.toArray(new Person[tmp.size()]);
    }
}
