import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        int value;

        Scanner inp=new Scanner(System.in);
        System.out.print("Dizinin eleman sayisini giriniz:");
        n=inp.nextInt();

        int [] list =new int[n];

        for(int i=0;i<n;i++){
            System.out.print(i+". elemani giriniz:");
            value=inp.nextInt();
            list[i]=value;
        }

        Arrays.sort(list);
        System.out.println(Arrays.toString(list));






    }
}
