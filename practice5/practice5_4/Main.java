package practice5.practice5_4;

// 物理模擬程式2
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int v;
        int t;
        int d = 0;

        for (int i = 0; i < n; i++){
            v = sc.nextInt();
            t = sc.nextInt();
            d += v * t;
        }

        System.out.println(d);
    }
}
