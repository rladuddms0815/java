package week10_homework;

public class while13 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("홀수:");
        while (i <= 50) {
            if (i % 2 == 1) {
                System.out.print(i + " ");
            }
            i++;
        }

        System.out.println("\n짝수:");
        i = 1;
        while (i <= 50) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
