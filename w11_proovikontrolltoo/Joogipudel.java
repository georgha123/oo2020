public class Joogipudel {
    int pudelityyp;
    Jook sisu;
    double maht, mass, taaraMaksumus;

    public Joogipudel(Jook usisu, double umaht, double umass, double utaaraMaksumus, int upudelityyp){
        sisu = usisu;
        maht = umaht;
        mass = umass;
        taaraMaksumus = utaaraMaksumus;
        pudelityyp = upudelityyp;

    }
    public String toString(){
        return "Sisu: " +sisu+ " taara " +((pudelityyp == 0)?"klaas ":"plastik ")+mass+ " kg " +taaraMaksumus+ " eur";
    }

    public double kysiMass(){
        if(sisu == null){
            return mass;
        }else{
            return mass+maht*sisu.kysiErikaal();
        }
    }

    public double kysiOmahind(){
        if(sisu==null){
            return taaraMaksumus;
        }
        return taaraMaksumus+maht*sisu.kysiOmahind();
    }

    public Jook kysiSisu(){
        return sisu;
    }

    public void uusSisu(Jook j){
        sisu=j;
    }

    public double kysiMaht(){
        return maht;
    }
}
