package practice3.practice3_9;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int arr[] = new int[7];
    for (int i = 0; i < arr.length; i++){
        arr[i] = sc.nextInt();
    }

    int upcount = 0, downcount = 0;
    
    // 技巧 => 沒有規律，依據條件是否成立而改變 
    int compare = arr[0];    // 占存變數
    for (int i = 0; i < arr.length; i++){
        if (i == 0){
            continue;
        }

        if (arr[i] > compare && arr[i] - compare <= 1000){
            upcount++;
            compare = arr[i];
        } else if (arr[i] < compare){
            downcount++;
            compare = arr[i];
        }
    }

    String result = "沒變";
    if (downcount > upcount){
        result = "變得節省";
    } else if (downcount < upcount){
        result = "變得會花";
    }

    System.out.println(result);
    }
}
