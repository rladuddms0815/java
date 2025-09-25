package week10_homework;

public class while16 {
    public static void main(String[] args) {
        int i = 3;
        long result = 1;
        while (i <= 30) {
            result *= i;
            i++;
        }
        System.out.println("3부터 30까지 곱: " + result);
    }
}
