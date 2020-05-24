public class Square implements Equations{

    double a;
    public Square(double ua) {
        a = ua;
    }

    @Override
    public double getArea(double a, double b) {
        return a*a;
    }

    @Override
    public double getCircumference(double a, double b) {
        return a*4;
    }
}
