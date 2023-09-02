package oop.phonebook;

public interface PhoneBook {
    boolean addPerson(Person p);
    boolean removePerson(Person p);
    Person[] searchByLastname(String lastname);
    Person[] searchByNameAndLastname(String name,String lastname);

}
