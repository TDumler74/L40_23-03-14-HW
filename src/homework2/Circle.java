package homework2;

public class Circle {
    // A=pi*r*r
    String name;
    double area;
    double radius;

    public Circle(String name, double radius) {
        this.name = name;
        this.radius = radius;
    }

    public double getArea() {
        return radius*radius*3.14;

    }

    @Override
    public String toString() {
        return  name +" has area of "+getArea();
    }

}
