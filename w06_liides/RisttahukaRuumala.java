public class RisttahukaRuumala implements Arvutatav{
    int a, b;

    public RisttahukaRuumala(int a, int b){
        this.a = a;
        this.b = b;
    }

    @Override
    public double f(double x) {
        return a*b*x;
    }

}

