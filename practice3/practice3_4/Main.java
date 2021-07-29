package practice3.practice3_4;

import java.util.Scanner;

// 數列問題
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numArr[] = new int[n];
        for (int i = 0; i < numArr.length; i++){
            int num = sc.nextInt();
            numArr[i] = num;
        }
        
        boolean result = true;
        for (int i = 2; i < numArr.length; i++){
            if (numArr[i - 2] * numArr[i - 1] != numArr[i]){
                result = false;
            }
        }

        System.out.println(result);
    }
}
