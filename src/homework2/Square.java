package homework2;

public class Square {
    //A=a*a
    String name;
    int sideA;
    int area;

    public Square(String name, int sideA) {
        this.name = name;
        this.sideA = sideA;
    }
    public int getArea(){
        return sideA*sideA;
    }

    @Override
    public String toString() {
        return name + " has area of "+getArea();
    }
}
