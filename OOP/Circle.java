package OOP;

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

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public double getArea(){
        return (this.getRadius() * this.getRadius()) * Math.PI;
    }
    public double getPerimeter(){
        return (this.getRadius() * 2) * Math.PI;
    }
    public boolean contains(Point point){
        double dist = Math.sqrt(Math.pow((point.x - center.x), 2) + Math.pow((point.y - center.y), 2));
        if(dist < radius){
            return true;
        }
        return false;

    }
    public void Translate(int dx, int dy){
        Point newCenter = new Point(dx, dy);
        setCenter(newCenter);
        return;
    }

    @Override
    public String toString() {
        return "Circle{" + "center=" + center + ", radius=" + radius + '}';
    }
}