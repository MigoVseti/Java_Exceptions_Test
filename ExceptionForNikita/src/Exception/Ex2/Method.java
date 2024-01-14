package Exception.Ex2;

public class Method {

    public static int division(int num, int num2) {
        if (num == 0 || num2 ==0){
            throw new ArithmeticException();
        }
        else {
            return num / num2;
        }
    }
}
