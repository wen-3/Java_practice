package practice3.practice3_3;

import java.util.Scanner;

// 運動成效3
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kg = sc.nextInt();
        int dreamKg = sc.nextInt();
        int time = 0;
        while (kg != dreamKg){
            time ++;
            if (kg > dreamKg){
                kg -= 4;
            }else{
                kg += 15;
            }
        }
        System.out.println(time);
    }
}