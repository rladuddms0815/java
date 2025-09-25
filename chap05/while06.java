package week10_homework;

import java.util.Scanner;

public class while06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫 번째 수 입력: ");
        int num1 = scanner.nextInt();

        System.out.print("두 번째 수 입력: ");
        int num2 = scanner.nextInt();

        System.out.print("연산 선택 (1:+, 2:-, 3:*, 4:/): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.println("결과: " + (num1 + num2));
        } else if (choice == 2) {
            System.out.println("결과: " + (num1 - num2));
        } else if (choice == 3) {
            System.out.println("결과: " + (num1 * num2));
        } else if (choice == 4) {
            if (num2 != 0) {
                System.out.println("결과: " + ((double) num1 / num2));
            } else {
                System.out.println("0으로 나눌 수 없습니다.");
            }
        } else {
            System.out.println("잘못된 선택입니다.");
        }
    }
}
