package practice2.practice2_6;

import java.util.Scanner;

// 動物繁衍
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int animal[][] = new int[t][2];

        for (int i = 0; i < animal.length; i++){
            int m = sc.nextInt();
            int f = sc.nextInt();
            int n = sc.nextInt();
            int mm;
            for (int k = 0; k < n; k++){
                mm = m * 2;
                int tmp = m;  // 做交換時要注意，保留原始數值
                m = f + mm;
                f = tmp;
            }
            animal[i][0] = m;
            animal[i][1] = f;
        }

        for (int num[] : animal){
            System.out.println(num[0] + " " + num[1]);
        }
    }
}
