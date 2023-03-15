package homework2;
/*
Создать классы, содержащие методы для подсчета площади прямоугольника, квадрата, круга:
Создать классы Circle, Rectangle, Square.
В классах должен быть метод getArea, осуществляющий подсчет соответствующей площади
В методе main класса Main создать массив или лист содержащий обьекты этих классов и вывести на экран площади фигур, содержащиеся в этом массиве а также название фигуры.
Подумать, должны ли быть созданы для выполнения задачи еще какие-то классы/класс и поля в классе/классах

Пример вывода на печать:
Circle has area of 200
Rectangle has area of 50.0
Square has area of 30.0
 */
public class Main {
    public static void main(String[] args) {

        Square square= new Square("Square", 10);


        Rectangle rectangle=new Rectangle("Rectangle",5,10);


        Circle circle=new Circle("Circle",5);

        Area[]area={circle,rectangle,square};
        for(int i=0; i<area.length;i++){
            System.out.println(area[i]);
        }
        //Circle has area of 78.5
        //Rectangle has area of 50
        //Square has area of 100
    }
}
