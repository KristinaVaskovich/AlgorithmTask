import java.util.Scanner;

public class ElementsDivisibleBy3 {
    public static void printElementsDivisibleBy3(int[] array){
        for (int element : array) {
            if (element % 3 == 0) {
                System.out.println(element);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество элементов в массивe: ");
        int number = scanner.nextInt();
        int[] array = new int[number];
        for (int i = 0; i < number; i++) {
            System.out.println("Введите элемент массива: ");
            array[i] = scanner.nextInt();
        }
        System.out.println("Элементы массива, кратные трем: ");
        printElementsDivisibleBy3(array);
    }
}
