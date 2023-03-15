package homework2;

public class Square extends Area {
    //A=a*a
    String name;
    int sideA;
    int area;

    public Square(String name, int sideA) {
        super(name);
        this.name = name;
        this.sideA = sideA;
    }
    public int getArea(){
        return sideA*sideA;
    }

    @Override
    public String toString() {
        return super.toString() +getArea();
    }
    public void speacialFeature(){
        System.out.println(name+" :all sides are the same.");

    }
}
