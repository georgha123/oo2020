public class Proov1{
    public static void main(String[] arg){
        Kilpkonnatyyp1 hallloom = new Kilpkonnatyyp1(-1, 1, "ida");
        Kilpkonnatyyp1 kollaneloom = new Kilpkonnatyyp1(2, 3, "p6hi");
        System.out.println(hallloom);
        System.out.println(kollaneloom);
        hallloom.edasi();
        kollaneloom.edasi();
        System.out.println(hallloom);
        System.out.println(kollaneloom);
        hallloom.paremale();
        System.out.println(hallloom);
        System.out.println(kollaneloom);
        hallloom.edasi();
        kollaneloom.paremale();
        System.out.println(hallloom);
        System.out.println(kollaneloom);

    }

}