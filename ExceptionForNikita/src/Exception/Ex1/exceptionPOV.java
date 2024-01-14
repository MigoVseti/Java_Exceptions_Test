package Exception.Ex1;
import java.util.Scanner;


public class exceptionPOV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        try {
            int num = scanner.nextInt();
            System.out.println(Math.pow(num, 2));
        }
        catch (Exception exception){
            System.out.println(exception.getMessage());
            System.out.println("Не верное значение");
        }

    }
}