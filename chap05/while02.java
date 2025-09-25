package week10_homework;

import java.util.Scanner;

public class while02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  // Scanner는 main 안에서 선언
        System.out.print("몇 번 반복할까요? ");
        int scan = scanner.nextInt();
        int j = 0;
        while (j < scan) {
            System.out.println("반복 출력: " + (j + 1));
            j++;
        }
    }
}