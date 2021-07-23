package practice5.practice5_5;

// 骰子遊戲
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[3];
        int max = 0;

        for (int i = 0; i < arr.length; i++){
            int point1 = sc.nextInt();
            int point2 = sc.nextInt();
            arr[i] = point1 + point2;
        }

        for (int i = 0; i < arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++){
            if (max == arr[i]){
                switch (i){
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
                break;
            }
        }
    }
}
