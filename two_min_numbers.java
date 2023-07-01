import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/
public class two_min_numbers {
    public static void main(String[] args) {
        String text = "8 4 5 4 5 8 exit";
        Scanner console = new Scanner(text);
        int i = 0;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        String copytext1 = new String();

        while (console.hasNextInt()) {
            int x = console.nextInt();
            i++;
            copytext1 += (x + " ");
            if (x <= min1)
                min1 = x;
        }
        if (i < 2)
            System.exit(1);
        Scanner copytext2 = new Scanner(copytext1);
        while (copytext2.hasNextInt()) {
            int y = copytext2.nextInt();
            if (y <= min2 && y > min1) {
                min2 = y;
            }
        }
        System.out.println(min2);
    }
}
