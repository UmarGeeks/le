import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String MyFirst;
        final int NUM = 5;
        String word = "fht";
        MyFirst = NUM + word;

        System.out.println(MyFirst);
        System.out.println(word);
        System.out.println(NUM);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else {
            System.out.println("Вы сохранили ноль");
        }

        Scanner scanner = new Scanner(System.in);
        String sc = scanner.nextLine();
        System.out.println("Привет, " + sc + "!");


    }
}