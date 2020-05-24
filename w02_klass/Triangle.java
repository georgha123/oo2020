public class Triangle {
    int a,b, c;
    double height;
    public Triangle(int ua, int ub, int uc, double uheight){
        a=ua;
        b=ub;
        c=uc;
        height=uheight;
    }

    public double area(){
        return (a * height) / 2;
    }

    public double circumference(){
        return a+b+c;
    }
}
