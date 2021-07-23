package practice2.practice2_3;

import java.util.Scanner;

// 判斷等比數列
// a ar ar^2 ar^3 ...
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nums[] = new int[n];
        boolean result = true;
        for (int i = 0; i < nums.length; i++){
            nums[i] = sc.nextInt();
        }
        
        // nums[0] 即為 a
        int r = nums[1] / nums[0];
        for (int i = 2; i < nums.length; i++){
            if (nums[i] != nums[0] * Math.pow(r, i)){
                result = false;
                break;
            }
        }
        System.out.println(result);
    }
}
