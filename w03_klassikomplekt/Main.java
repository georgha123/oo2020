

public class Main{

    public static void main(String[] args){
        Square square = new Square(9);
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println(square.getArea());
        System.out.println(square.getPerimeter());
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
    }
}