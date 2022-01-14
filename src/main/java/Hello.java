import java.util.Scanner;

public class Hello {
    public static String enterNumber(int number) {
        String result = "";
        if (number > 7) {
            result = "Привет";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для проверки: ");
        int number = scanner.nextInt();
        String result = enterNumber(number);
        System.out.println(result);
    }
}
