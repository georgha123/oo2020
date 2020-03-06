import java.io.BufferedReader;
import java.io.*;

public class Arvutamine{
    

    public static int firstDigit(int x) {

        return x = Integer.parseInt(Integer.toString(x).substring(0, 1));
    }

    public static void main(String[] args) throws Exception{

        int[] arvud = new int[2];
        int jagatud = 0;
        BufferedReader br1 = new BufferedReader(new FileReader("Arvud.txt"));

        for(int i = 0; i <arvud.length; i++){
            arvud[i] = Integer.parseInt(br1.readLine());
        }
        br1.close();
        
        if (arvud[1] != 0){
            jagatud = arvud[0] / arvud[1];
        }
        
        int korrutis = firstDigit(jagatud) * arvud[1];

        System.out.println("Jagamise tulemus: " +String.valueOf(jagatud));
        System.out.println("Korrutamine vastuse esimese arvuga: " +String.valueOf(korrutis));

        // System.out.println();
        // int jagatav = (int)arvud[0];
        // int jagaja = (int)arvud[1];
        // int j22k = 0;
        // int kontroll = 0;
        // String vahe = "-";

        // System.out.println(String.valueOf(jagatav)+ "/" +String.valueOf(jagaja));





    }
}