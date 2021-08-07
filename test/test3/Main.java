package test.test3;

import java.util.Scanner;

// 統計字元類型
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();  // 吸收空格
        String content = sc.nextLine();
        String words[] = content.split("");
        
        // 分別統計英文字母(大小寫都要)、空格、數字和其它字元的個數
        int englishCount = 0, spaceCount = 0, numCount = 0, otherCount = 0;
        
        // 判斷(逐一比對)
        for (String word : words){
            if (word.matches("[a-zA-Z]")){
                englishCount++;
            } else if (word.matches("\\s")){
                spaceCount++;
            } else if (word.matches("[0-9]")){
                numCount++;
            } else {
                otherCount++;
            }
        }

        // 結果印出
        System.out.println(englishCount);
        System.out.println(spaceCount);
        System.out.println(numCount);
        System.out.println(otherCount);
    }
}
