package functional;

import java.util.*;
import java.util.stream.Collectors;

public class PhoneBook {

    List<Person> phonebook = new ArrayList<>();

    public PhoneBook(List<Person> phonebook) {
        this.phonebook = phonebook;
    }

    public List<Person> getPhonebook() {
        return phonebook;
    }

    public void setPhonebook(List<Person> phonebook) {
        this.phonebook = phonebook;
    }

    public static class Person {
        String name;
        String lastname;
        String phone;

        public Person(String name, String lastname, String phone) {
            this.name = name;
            this.lastname = lastname;
            this.phone = phone;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getLastname() {
            return lastname;
        }

        public void setLastname(String lastname) {
            this.lastname = lastname;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }
    }

    public Optional<Person> searchByLastname(String lastname) {
       return phonebook.stream().filter(t1 -> t1.getLastname().equals(lastname)).findFirst();
    }
    public Optional<Person> searchByNameAndLastname(String name, String lastname) {
        return phonebook.stream().filter(t1 -> t1.getLastname().equals(lastname) && t1.getName().equals(name)).findFirst();

    }




}
