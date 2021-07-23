package practice5.practice5_2;

import java.util.Scanner;

// 學生點名系統

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[10][2];

        // 學生座號
        for (int i = 0; i < arr.length; i++){
            arr[i][0] = i + 1;
        }

        // 學生缺席次數
        // 輸入五天的缺席名單
        for (int i = 0; i < 5; i++){
            int count = sc.nextInt();
            if (count == -1){
                continue;
            }
            for (int j = 0; j < count; j++){
                int n = sc.nextInt();
                for (int k = 0; k < arr.length; k++){
                    if (n == arr[k][0])
                    arr[k][1]++;
                }   
            }
        }

        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i][0] + "." + arr[i][1]);
        }   
    }
}
