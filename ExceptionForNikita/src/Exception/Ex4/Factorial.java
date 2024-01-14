package Exception.Ex4;
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (num > 0){
            Method.factMethod(num);
        }
        else {
            throw new ArithmeticException("Значение должно быть больше нуля");
        }

    }
}
