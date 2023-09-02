package oop.shape;

import java.awt.*;

abstract class AbstractShape implements Computable,Movable,Resizable {
    String color;
    String id;

    public AbstractShape(String color, String id) {
        this.color = color;
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {

        if (!color.matches("^#[0-9a-fA-F]{6}")) {
            throw new IllegalArgumentException("Error");
        }
        this.color = color;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    abstract public double getArea();


    abstract public double getPerimeter();

    abstract public void move(Point p);

    abstract public void resize(double lenght);
}

