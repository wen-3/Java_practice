package practice4.practice4_2;

import java.util.Scanner;

// 變差數列
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++){
            int num = sc.nextInt();
            arr[i] = num;
        }

        int differenceArr[] = new int[n - 1];
        for (int i = 1; i < arr.length; i++){
            int num = arr[i] - arr[i - 1];
            differenceArr[i - 1] = num;
        } 

        int r = differenceArr[1] - differenceArr[0];
        boolean result = true;
        for (int i = 2; i < differenceArr.length; i++){
            if (differenceArr[i] - differenceArr[i - 1] != r){
                result = false;
                break;
            }
        }

        System.out.println(result);
    }
}
