package week10_homework;

import java.util.Scanner;

public class while17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("시작 숫자: ");
        int start = scanner.nextInt();
        System.out.print("끝 숫자: ");
        int end = scanner.nextInt();
        System.out.print("짝수(0)/홀수(1) 선택: ");
        int choice = scanner.nextInt();

        long result = 1;
        while (start <= end) {
            if (start % 2 == choice) {
                result *= start;
            }
            start++;
        }
        System.out.println("곱: " + result);
    }
}
