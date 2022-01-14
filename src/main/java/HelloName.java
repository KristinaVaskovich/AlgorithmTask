import java.util.Scanner;

public class HelloName {
    static String nameViacheslav = "Вячеслав";

    public static String enterName(String name) {
        String result = "";
        if (name.equals(nameViacheslav)) {
            result = "Привет, " + nameViacheslav;
        } else {
            result = "Нет такого имени";
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя для проверки: ");
        String name = scanner.nextLine();
        String result = enterName(name);
        System.out.println(result);
    }
}
