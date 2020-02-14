import java.util.Scanner;

public class Akvaarium{
    double pikkus, k6rgus, laius;
    double vettml,vesicm;
    
    public double suurused(){
        double kuupsuurus = (laius * k6rgus * pikkus);
        
        return kuupsuurus;
    }

    public double veek6rgus(){
        double veelmahub = k6rgus - paljuVett();
        return veelmahub;
    }

    public double paljuVett(){

        double vesicm = vettml / (laius * pikkus);

        return vesicm;

    }


}