package week10_homework;

public class while09 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        while (i <= 20) {
            sum += i;
            i++;
        }
        System.out.println("1부터 20까지의 합: " + sum);
    }
}
