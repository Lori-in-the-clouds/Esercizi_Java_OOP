package oop.phonebook;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PhoneBookArray implements  PhoneBook{
    static final int MAX_PERSON = 256;
    Person[] phoneBook;

    @Override
    public boolean addPerson(Person p) {
        for (int i = 0; i<MAX_PERSON;i++) {
            if (phoneBook[i] != null && phoneBook[i].equals(p)) return false;
        }
        for (int i = 0; i<MAX_PERSON;i++) {
            if (phoneBook[i] == null) {
                phoneBook[i] = p;
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean removePerson(Person p) {
        for (int i = 0; i<MAX_PERSON;i++) {
            if (phoneBook[i] != null && phoneBook[i].equals(p)) {
                phoneBook[i] = null;
                return true;
            }
        }
        return false;
    }

    @Override
    public Person[] searchByLastname(String lastname) {
        List<Person> tmp = new ArrayList<>();
        for (Person i : phoneBook) {
            if (i != null && i.getLastname().equals(lastname)) tmp.add(i);
        }
        return tmp.toArray(new Person[tmp.size()]);
    }

    @Override
    public Person[] searchByNameAndLastname(String name, String lastname) {

        List<Person> tmp = new ArrayList<>();
        for (Person i : phoneBook) {
            if (i != null && i.getLastname().equals(lastname) && i.getName().equals(name)) tmp.add(i);
        }
        return tmp.toArray(new Person[tmp.size()]);
    }
}
