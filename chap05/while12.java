package week10_homework;

public class while12 {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        while (true) {
            sum += num;
            System.out.print(num);
            if (sum >= 100) {
                break;
            }
            System.out.print(" + ");
            num += 2;
        }
        System.out.println(" = " + sum);
    }
}