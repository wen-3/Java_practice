package practice5.practice5_1;

import java.util.Scanner;

// 數列分布

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arrNum[][] = new int[n][];
        
        // arrNum[0][0] = 1;  // r1 = 1
        
        // arrNum[1][0] = 1; 存放次數  // r2 = 11
        // arrNum[1][1] = 1; 存放數值

        // arrNum[2][0] = 2;  // r3 = 21
        // arrNum[2][1] = 1;
        
        arrNum[0] = new int[1];
        arrNum[0][0] = 1;

        for (int i = 1; i < arrNum.length; i++){
            
            int tmp = arrNum[i - 1][0];
            int countNum = 1;
            for (int j = 1; j < arrNum[i - 1].length; j++){
                if (tmp == arrNum[i - 1][j]){
                    continue;
                }
                tmp = arrNum[i - 1][j];
                countNum++;
            }

            arrNum[i] = new int[countNum * 2];
            
            int tmp1 = arrNum[i - 1][0];
            int time = 1;
            int index = 0;

            if (i == 1){
                arrNum[i][index] = time;   // 放次數
                index += 1;
                arrNum[i][index] = tmp1;   // 放數值
                continue;
            }

            for (int j = 1; j < arrNum[i - 1].length; j++){
                if (tmp1 == arrNum[i - 1][j]){
                    time++;
                    continue;
                }

                arrNum[i][index] = time;   // 放次數
                index += 1;
                arrNum[i][index] = tmp1;   // 放數值
                index++;

                tmp1 = arrNum[i - 1][j];
                time = 1;
            }
            
            arrNum[i][index] = time;   // 放次數
            index += 1;
            arrNum[i][index] = tmp1;   // 放數值
        }

        for (int i = 0; i < arrNum[n-1].length; i++){
            System.out.print(arrNum[n-1][i]);
        }
    }
}
