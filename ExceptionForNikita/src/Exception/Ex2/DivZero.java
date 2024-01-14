package Exception.Ex2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class DivZero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        try {
            int result = Method.division(a, b);
            System.out.println(result);
        }
        catch (Exception ex){
            System.out.println("Ошибка деления на ноль");
        }
    }

}
