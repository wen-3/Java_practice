package practice4.practice4_7;

import java.util.Scanner;

// 降雨機率2
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];

        for (int i = 0; i < arr.length; i++){
            int x = sc.nextInt();

            String result = "出門";
            if (x <= 100 && x >= 61){
                result = "不出門";
            } else if (x >= 31){
                result = "帶傘出門";
            }

            arr[i] = result;
        }

        for (String result : arr){
            System.out.println(result);
        }
    }
}
