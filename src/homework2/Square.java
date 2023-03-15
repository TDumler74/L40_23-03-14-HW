package homework2;

public class Square extends Area {
    //A=a*a
    int sideA;
    public Square(String name, int sideA) {
        super(name);
        this.sideA = sideA;
    }
    public double getArea(){
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
