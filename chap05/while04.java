package week10_homework;

import java.util.Scanner;

public class while04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("구구단 단수 입력: ");
        int dan = scanner.nextInt();
        int i = 1;
        while (i <= 9) {
            System.out.println(dan + " * " + i + " = " + (dan * i));
            i++;
        }
    }
}
