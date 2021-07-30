package practice5.practice5_5;

// 骰子遊戲
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[3];
        int max = 0;
        int win = 0;
        for (int i = 0; i < arr.length; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            arr[i] = a + b;
            if (max < arr[i]){
                max = arr[i];
                win = i;
            }
        }

        switch (win) {
            case 0:
                System.out.println("A");
                break;
            case 1:
                System.out.println("B");
                break;
            case 2:
                System.out.println("C");
                break;
        }
    }
}
