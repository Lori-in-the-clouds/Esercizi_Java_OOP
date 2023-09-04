package oop.phonebook;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookListTest extends PhoneBookTest{
    @BeforeEach
    void setUp() {
        pb = new PhoneBookList();
        pb.addPerson(new Person("Nicola", "Bicocchi", "34567"));
        pb.addPerson(new Person("Marco", "Rizzo", "45243"));
        pb.addPerson(new Person("Luisa", "Poppi", "24564"));
    }

}