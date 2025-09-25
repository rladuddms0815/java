package week10_homework;

public class while05 {
    public static void main(String[] args) {
        int i = 1;
        int result = 1;
        while (i <= 10) {
            result *= i;
            i++;
        }
        System.out.println("1부터 10까지의 곱: " + result);
    }
}
