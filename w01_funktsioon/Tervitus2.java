public class Tervitus2{
    public static void main(final String[] arg) {
        if(arg.length>0){
        System.out.println("Tere, " +arg[0]);
        System.out.println("sinu nimes on " +arg[0].length()+ " tähte.");
        } else{
            System.out.println("Kasuta kujul:");
            System.out.println("java Tervitus2 Juku");
        }
    }
}