public class Arvutamine1{
    double x, y;
    public Arvutamine1(int arv1, int arv2){
        x = arv1;
        y = arv2;
    }
    public double ruutjuur(){
        return Math.sqrt(x * y);
    }

    public String toString(){
        String sx = String.valueOf(x);
        String sy = String.valueOf(y);
        return (sx+' '+sy);
    }

}