import java.util.Scanner;

public class PrintingArrays {

    /*
    Reverse
    */
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        int N = console.nextInt();
        int[] numbers;
        if (N > 0) {
            numbers = new int[N];
            for (int i = 0; i < N; i++) {
                numbers[i] = console.nextInt();
            }
            if (N % 2 == 0) {
                for (int i = numbers.length - 1; i >= 0; i--) {
                    System.out.println(numbers[i]);
                }
            } else {
                for (int number : numbers) {
                    System.out.println(number);
                }
            }
        }
    }
}
