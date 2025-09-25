package week10_homework;

import java.util.Scanner;

public class while19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("팩토리얼 계산할 n 입력: ");
        int n = scanner.nextInt();

        int i = 1;
        long result = 1;

        System.out.print("결과 출력: ");
        while (i <= n) {
            System.out.print(i);
            if (i != n) {
                System.out.print("*");
            }
            result *= i;
            i++;
        }
        System.out.println("=" + result);
    }
}
