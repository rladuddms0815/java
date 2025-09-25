package week10_homework;

import java.util.Scanner;

public class while08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int balance = 0;
        boolean running = true;

        while (running) {
            System.out.println("-------------------------");
            System.out.println("1. 예금 | 2. 출금 | 3. 잔고 | 4. 종료");
            System.out.print("선택> ");
            int menu = scanner.nextInt();

            switch (menu) {
                case 1:
                    System.out.print("예금액> ");
                    int deposit = scanner.nextInt();
                    balance += deposit;
                    break;
                case 2:
                    System.out.print("출금액> ");
                    int withdraw = scanner.nextInt();
                    if (withdraw <= balance) {
                        balance -= withdraw;
                    } else {
                        System.out.println("잔액 부족");
                    }
                    break;
                case 3:
                    System.out.println("잔고> " + balance);
                    break;
                case 4:
                    System.out.println("프로그램 종료");
                    running = false;
                    break;
                default:
                    System.out.println("잘못된 선택입니다.");
            }
        }
    }
}
