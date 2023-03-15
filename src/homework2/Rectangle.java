package homework2;

public class Rectangle extends Area {
    // A=a*b
    int sideA;
    int sideB;
    int area;

    public Rectangle(String name, int sideA, int sideB) {
        super(name);
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public double getArea(){
        return sideA*sideB;
    }

    @Override
    public String toString() {
        return super.toString()+getArea() ;
    }
    public void speacialFeature(){
        System.out.println(name+ " : one side bigger than the other. ");
    }
}
