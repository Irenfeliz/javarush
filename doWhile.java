import java.util.Scanner;

public class doWhile {
    public static void main(String[] args) {
        //напишите тут ваш код
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        int number = console.nextInt();
        int i = 0;
        do {
            System.out.println(str);
            if (number <= 0 || number >= 5) break;
            i++;
        }
        while (i < number);

    }
}
