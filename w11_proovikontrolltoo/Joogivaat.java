public class Joogivaat{
    double maht;
    double taidetud;
    Jook sisu;
    public Joogivaat(Jook usisu, double umaht, double utaidetud){
        sisu=usisu; maht=umaht; taidetud=utaidetud;
    }
    public void taida(Joogipudel p){
        if(p.kysiSisu()==null){
            if(p.kysiMaht()<=taidetud){
                p.uusSisu(sisu);
                taidetud-=p.kysiMaht();
            }
        }
    }
    public String toString(){
        return maht+" l vaat sisuga "+sisu+", sees "+taidetud;
    }
    public void taida(Joogipudel[] pudelid){
        for(int i=0; i<pudelid.length; i++){
            taida(pudelid[i]);
        }
    }
    public double kysiTaidetud(){
        return taidetud;
    }
}