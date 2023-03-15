package homework2;

public class Rectangle  {
    // A=a*b
    String name;
    int sideA;
    int sideB;
    int area;

    public Rectangle(String name, int sideA, int sideB) {
        this.name = name;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getArea(){
        return sideA*sideB;
    }

    @Override
    public String toString() {
        return name +" has area of "+getArea() ;
    }
}
