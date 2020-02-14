public class Kilpkonnatyyp1{
    int x, y;
    String suund;
    public Kilpkonnatyyp1(int ux, int uy, String usuund){
        x = ux;
        y = uy;
        suund = usuund;
        if(!kasAsukohtSobib()){
            System.out.println("Sobimatu asukoht "+ this.toString());
            // throw new RuntimeException("Asukoht ei sobi: "+ this);

        }
    }
    public String toString(){
        return "("+x+", "+y+", "+suund+")";
    }
    public boolean kasAsukohtSobib(){
        if(x < 1){return false;}
        if(y < 1){return false;}
        if(x > 4){return false;}
        if(y > 4){return false;}
        return true;
    }
    
    public int kysix(){
        return x;
    }
    public int kysiy(){
        return y;
    }

    public void paremale(){
        if(suund.equals("ida")){
            suund = "l6una";
        } 
        else if(suund.equals("l6una")){
            suund = "l22ne";
        } 
        else if(suund.equals("l22ne")){
            suund = "p6hi";
        } 
        else {
            suund = "ida";
        } 
    }
    public void edasi(){
        if(suund.equals("ida")){
            x++;
        }
        else if(suund.equals("l22ne")){
            x--;
        }
        else if(suund.equals("l6una")){
            y++;
        } 
        else{
            y--;
        }
    }
}