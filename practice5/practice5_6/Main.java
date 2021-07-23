package practice5.practice5_6;

// 海拔與氣溫
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        float t = sc.nextFloat();
        float h = sc.nextFloat();
        float temperature = 0;
        switch (s) {
            case 1:
                temperature = (float)(t - (h / 100) * 0.6);
                break;
            case 2:
                temperature = (float)(t - (h / 100) * 0.36);
                break;
        }

        System.out.printf("%.2f",temperature);
    }
}
