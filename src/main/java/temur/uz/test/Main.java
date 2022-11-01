package temur.uz.test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        char s [] = str.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i]=='4' || s[i] == '7'){
                count ++;
            }
        }
        if (count == 4 || count == 7){
            System.out.println("YES");
        }else {
            System.out.println("NO");
        }
        System.out.println(luckyNumber(str));
    }
    public static String luckyNumber(String str){
        char s [] = str.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i]=='4' || s[i] == '7'){
                count ++;
            }
        }
        if (count == 4 || count == 7)
            return "YES";
        return "NO";
    }
}
