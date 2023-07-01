import java.util.Scanner;

public class radius {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int radius = console.nextInt();
        double pi = 3.14;
        double S = pi * radius * radius;
        System.out.println((int)(S));
    }
}
