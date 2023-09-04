package oop.library;

public class Dvd extends Item {
    int lenght;

    public Dvd(String title, int year, int lenght) {
        super(title, year);
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }


}
