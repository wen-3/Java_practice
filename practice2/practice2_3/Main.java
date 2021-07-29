package practice2.practice2_3;

import java.util.Scanner;

// 判斷等比數列
// a ar ar^2 ar^3 ...
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int numArr[] = new int[n];
        boolean result = true;
        
        for (int i = 0; i < numArr.length; i++){
            numArr[i] = sc.nextInt();
        }
        
        int r = numArr[1] / numArr[0];
        for (int i = 2; i < numArr.length; i++){
            if (numArr[i] != numArr[i - 1] * r){
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
