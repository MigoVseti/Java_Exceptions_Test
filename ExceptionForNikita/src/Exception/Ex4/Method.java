package Exception.Ex4;

public class Method {
    public static void factMethod(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}
