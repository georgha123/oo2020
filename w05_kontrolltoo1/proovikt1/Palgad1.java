import java.io.*;
public class Palgad1{
    public static void main(String[] arg){
        double[] koefd = new double[5];
        BufferedReader br1 = new BufferedReader(new FileReader("Palgad1.txt"));
        double puhver = 1;
        for(int i=0; i<koefd.length; i++){
            koefd[i] = Double.parseDouble(br1.readLine());
            puhver = puhver*koefd[i];
        }
        double palk = Double.parseDouble(br1.readLine());
        double keskkoef = Math.pow(puhver, 1.0/koefd.length);
        double tingpalk = palk;
        PrintWriter pw1 = new PrintWriter("Palk2.txt");
        pw1.println(palk);
        for(int i=0; i<koefd.length; i++){
            palk = palk*koefd[i];
            tingpalk*=keskkoef;
            pw1.println(koefd[i]+ " " + palk);

        }
        pw1.close();
    }
}