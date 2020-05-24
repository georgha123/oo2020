public class Proov3 {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(4,2,2, 3);
        Triangle triangle2 = new Triangle(5,3,3, 2.5);

        System.out.println("Esimese kolmnurga pindala on " + triangle1.area());
        System.out.println("Esimese kolmnurga ümbermõõt on " + triangle1.circumference());
        System.out.println("Teise kolmnurga pindala on " + triangle2.area());
        System.out.println("Teise kolmnurga ümbermõõt] on " + triangle2.circumference());

    }
}

//        Esimese kolmnurga pindala on 6.0
//        Esimese kolmnurga ümbermõõt on 8.0
//        Teise kolmnurga pindala on 6.25
//        Teise kolmnurga ümbermõõt] on 11.0
//
//        Process finished with exit code 0
