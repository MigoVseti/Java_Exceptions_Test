package Exception.Ex5;

public class MethodMass {
    public static void sumMass(Integer[] num){
        int result = 0;
        for(int i = 0; i < num.length; i++){
            result += num[i];
        }
        System.out.println(result);
    }
}
