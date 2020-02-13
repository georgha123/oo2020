import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class hw1{
    public static void main(String args[]) {
        int sum = 0;
        List<Integer> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        System.out.println("Kui palju numbreid soovid sisestada ? ");
        int n = scan.nextInt();
        while(n == 0){
            System.out.println("Sisesta norm arv tatt? ");
            n = scan.nextInt();
        }

        System.out.println("Sisesta " +n+ " numbrit: ");
        for(int i = 0; i < n; i++){
            list.add(scan.nextInt());
//            sum = sum + list.get(i);
        }
        int res = list.stream().mapToInt(Integer::intValue).sum();
//        for(int j = 0; j < list.size(); j ++){
//            o = o + list.get(j);
//        }
//        System.out.println(res);
        System.out.println("Aritmeetiline keskmine = " + res/list.size());

    }
}