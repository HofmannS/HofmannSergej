import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         int num1;
         int num2;

        Scanner scanner = new Scanner(System.in);

        System.out.print("первое число: ");
        num1 = scanner.nextInt();

        System.out.print("второе число: ");
        num2 = scanner.nextInt();
        int sum = num1 + num2;

        System.out.println(sum);

        // Закрываем сканер
        scanner.close();
    }
}
