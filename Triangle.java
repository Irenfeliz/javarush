public class Triangle {

/*
Треугольный массив
*/
    public static int[][] result = new int[10][];

    public static void main(String[] args) {
        //напишите тут ваш код
        for (int i = 0; i < 10; i++) {
            result[i] = new int[i + 1];
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < result[i].length; j++) {
                result[i][j] = i + j;
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

    }
}
