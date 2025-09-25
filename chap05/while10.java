package week10_homework;

public class while10 {
    public static void main(String[] args) {
        int i = 7;
        int sum = 0;
        while (i <= 30) {
            sum += i;
            i++;
        }
        System.out.println("7부터 30까지의 합: " + sum);
    }
}
