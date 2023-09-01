package oop.basic;

import java.awt.*;

public class Circle {
    Point center;
    int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setCenter(int dx,int dy) {
        this.center.y = dy;
        this.center.x = dx;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public double getPerimeter() {
        return (double)Math.PI*2*getRadius();
    }

    public double getArea() {
        return (double)Math.PI*Math.pow(getRadius(),2);
    }

    public boolean contains(Point point) {
       double dst1 = point.distance(center);
       if (dst1 > radius) return false;
       return true;
    }

    public void translate(int dx,int dy) {
        int newdx = (int)center.getX()+dx;
        int newdy = (int)center.getY()+dy;
        setCenter(newdx,newdy);
    }

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }
}
