public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle =  new Rectangle(4,5);

        System.out.println("Ruudu pindala on " + square.getArea(5,0));
        System.out.println("Ruudu ümbermõõt on " + square.getCircumference(5,0));
        System.out.println("Ristküliku pindala on "+ rectangle.getArea(4,5));
        System.out.println("Ristküliku ümbermõõt on " + rectangle.getCircumference(4,5));
    }
}

//    Ruudu pindala on 25.0
//        Ruudu ümbermõõt on 20.0
//        Ristküliku pindala on 20.0
//        Ristküliku ümbermõõt on 18.0
