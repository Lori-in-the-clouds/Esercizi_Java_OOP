package oop.basic;

import java.awt.*;
import java.util.Arrays;

public class Polygon {
    Point[] vertices;

    public Polygon(Point[] vertices) {
        this.vertices = vertices;
    }

    public int getVerticesCount() {
        return vertices.length;
    }

    public double getPerimeter() {
        double perimeter = 0;
        for (int i=0;i<vertices.length-1;i++) {
            perimeter+= vertices[i].distance(vertices[i+1]);
        }
        perimeter+= vertices[vertices.length-1].distance(vertices[0]);
        return perimeter;
    }

    public double getArea() {
        double area = 0;
        for (int i = 0; i< vertices.length-1; i++) {
            area += (vertices[i+1].getX() * vertices[i].getY()) - (vertices[i+1].getY()*vertices[i].getX());
        }
        return Math.abs(area)*0.5;
    }

    @Override
    public String toString() {
        return "Polygon{" +
                "vertices=" + Arrays.toString(vertices) +
                '}';
    }
}
