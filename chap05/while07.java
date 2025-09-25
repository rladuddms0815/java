package week10_homework;

import java.util.Scanner;

public class while07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        while (true) {
            System.out.print("숫자 입력 (음수 입력 시 종료): ");
            int num = scanner.nextInt();

            if (num < 0) break;

            sum += num;
            count++;
        }

        if (count > 0) {
            System.out.println("총합: " + sum);
            System.out.println("평균: " + ((double) sum / count));
        } else {
            System.out.println("입력된 수가 없습니다.");
        }
    }
}
