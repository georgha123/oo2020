import java.util.Scanner;

public class Proov2{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Akvaarium a1 = new Akvaarium();
        System.out.println("Mis on akvaariumi k6rgus?");
        int k6rgus = scan.nextInt();
        System.out.println("Mis on akvaariumi laius?");
        int laius = scan.nextInt();
        System.out.println("Mis on akvaariumi pikkus?");
        int pikkus = scan.nextInt();
        System.out.println("mitu milliliitrit vett on akvaariumis hetkel?");
        int vettml = scan.nextInt();
        System.out.println("Vett mahub veel " + a1.veek6rgus()+ " cm");



    }


}