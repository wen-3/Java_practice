package test.test1;

import java.util.Scanner;

// 矩陣翻轉
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   // 代表行
        int m = sc.nextInt();   // 代表列

        // 輸入陣列的元素
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++){
            for (int k = 0; k < m; k++){
                arr[i][k] = sc.nextInt();
            }
        }

        // 翻轉陣列
        int reverseArr[][] = new int[m][n];
        for (int i = 0; i < n; i++){
            for (int k = 0; k < m; k++){
                reverseArr[k][i] = arr[i][k];
            }
        }

        for (int i = 0; i < m; i++){
            for (int k = 0; k < n; k++){
                System.out.print(reverseArr[i][k]);
                if (k < n - 1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
