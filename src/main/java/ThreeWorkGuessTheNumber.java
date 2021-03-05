import java.util.Scanner;

public class ThreeWorkGuessTheNumber {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        do {
            System.out.println("Угадай число!");
            playLevel(9);
            System.out.println("Повторить игру? 1 - да / 0 - нет");
        }
        while (scanner.nextInt() == 1);
        scanner.close();
    }

    private static void playLevel(int range) {
        int number = (int) (Math.random() * range);
        for (int i = 3; i > 0; i--) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Вы угадали");
                return;
            } else if (input_number > number) {
                System.out.println("Загаданое число меньше");
            } else {
                System.out.println("Загаданое число больше");
            }
        }
        System.out.println("Попытки закончились!");

    }
}
