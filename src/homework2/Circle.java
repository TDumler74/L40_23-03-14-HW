package homework2;

public class Circle extends Area {
    // A=pi*r*r
    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.name = name;
        this.radius = radius;
    }
    public double getArea() {
        return radius*radius*3.14;

    }

    @Override
    public String toString() {
        return  super.toString() +getArea();
    }

    @Override
    public void speacialFeature() {
        System.out.println(name+" : has no corners");
    }
}
