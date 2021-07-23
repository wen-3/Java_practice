package practice4.practice4_10;

import java.util.Scanner;

// 班級排名 - 依照成績將學生進行排序並輸出
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 學生人數
        int arr[][] = new int[n][2];
        for (int i = 0; i < arr.length; i++){
            int serial = sc.nextInt();  // 學生學號
            int score = sc.nextInt();   // 學生成績
            arr[i][0] = serial;
            arr[i][1] = score;
        }
        
        for (int i = 1; i < arr.length; i++){
            for (int j = 0; j < arr.length - i; j++){
                if (arr[j][1] < arr[j + 1][1]){   // 小 < 大
                    int tmp[] = arr[j + 1];    // 小 <= 大，tmp = 大
                    arr[j + 1] = arr[j];       // 後置位 => 小
                    arr[j] = tmp;              // 前置位 => 大
                }   // 數字大往前排
            }
        }

        for (int i = 0 ; i < arr.length; i++){
            System.out.println(arr[i][0] + "." + arr[i][1]);
        }
    }
}
