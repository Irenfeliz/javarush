import java.util.Scanner;

public class ArrayStrings {

/*
Удаляем одинаковые строки
*/

    public static String[] strings;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = console.nextLine();
        }

        for (int i = 0; i < strings.length; i++) {
            String oneString = strings[i];
            for (int j = i + 1; j < strings.length; j++) {
                if (oneString == null) {
                    break;
                } else if (oneString.equalsIgnoreCase(strings[j])) {
                    strings[i] = null;
                    strings[j] = null;
                }
            }
        }
        for (String string : strings) {
            System.out.print(string + ", ");
        }
    }
}
