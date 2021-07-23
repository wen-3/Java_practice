package practice1.practice1_9;

import java.util.Scanner;

// 計算平均值
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int count = 0;
        int avg;
        while (true){
            int num = sc.nextInt();
            if (num == -1){
                break;
            }
            sum += num;
            count++;
        }
        avg = sum / count;
        System.out.println(avg);
    }
}
