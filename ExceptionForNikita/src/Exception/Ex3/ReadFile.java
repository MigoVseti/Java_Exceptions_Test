package Exception.Ex3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;

public class ReadFile {
    public static void main(String[] args){
        try (Reader fileReader = new FileReader("test.txt")){
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (IOException e) {
            System.out.println("Ошибка в чтении файла: " + e.getMessage());
        }

    }
}
