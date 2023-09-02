package oop.shape;

import java.awt.*;

public class Rectangle extends AbstractShape {
    Point bottomRight;
    Point upperLeft;

    public Rectangle(String color, String id, Point bottomRight, Point upperLeft) {
        super(color, id);
        this.bottomRight = bottomRight;
        this.upperLeft = upperLeft;
    }

    public Point getBottomRight() {
        return bottomRight;
    }

    public void setBottomRight(Point bottomRight) {
        this.bottomRight = bottomRight;
    }

    public Point getUpperLeft() {
        return upperLeft;
    }

    public void setUpperLeft(Point upperLeft) {
        this.upperLeft = upperLeft;
    }

    @Override
    public double getArea() {
        double lat1 = Math.abs(bottomRight.getX()-upperLeft.getX());
        double lat2 =Math.abs(bottomRight.getY()-upperLeft.getY());
        return lat1*lat2;
    }

    @Override
    public double getPerimeter() {
        double lat1 = Math.abs(bottomRight.getX()-upperLeft.getX());
        double lat2 =Math.abs(bottomRight.getY()-upperLeft.getY());
        return (lat1*2)+(lat2*2);
    }

    @Override
    public void move(Point p) {
        upperLeft.translate((int)p.getX(),(int)p.getY());
        bottomRight.translate((int)p.getX(),(int)p.getY());
    }

    @Override
    public void resize(double scale) {
        bottomRight.x = (int) (upperLeft.x + (bottomRight.x-upperLeft.x)*scale);
        bottomRight.y = (int) (upperLeft.y - (upperLeft.y-bottomRight.y)*scale);
    }
}
