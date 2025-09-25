package week10_homework;

import java.util.Scanner;

public class while11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("시작 숫자: ");
        int start = scanner.nextInt();
        System.out.print("끝 숫자: ");
        int end = scanner.nextInt();

        int sum = 0;
        while (start <= end) {
            sum += start;
            start++;
        }
        System.out.println("합: " + sum);
    }
}
