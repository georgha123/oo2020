public class Rectangle implements Equations{
    double a, b;

    public Rectangle(double ua, double ub){
        a=ua;
        b=ub;
    }

    @Override
    public double getArea(double a, double b) {
        return a*b;
    }

    @Override
    public double getCircumference(double a, double b) {
        return (a+b)*2;
    }


}
