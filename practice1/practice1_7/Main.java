package practice1.practice1_7;

import java.util.Scanner;

// 連續求最大值
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0 ; i < n; i++){
            int k = sc.nextInt();
            int max = 0;
            for (int j = 0; j < k; j++){
                int num = sc.nextInt();
                if (max < num){
                    max = num;
                }
            }
            arr[i] = max;
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
