public class Jook{

    String nimetus;
    double omahind, erikaal;

    public Jook(String xNimetus, double yOmahind, double zErikaal){
        this.nimetus = xNimetus;
        this.omahind = yOmahind;
        this.erikaal = zErikaal;
    }

    public String kysiNimetus(){
        return nimetus;
    }
    public double kysiOmahind(){
        return omahind;
    }
    public double kysiErikaal(){
        return erikaal;
    }
    public String toString(){
        return nimetus+" "+omahind+" eur/liiter "+erikaal+" kg/liiter";
    }

}