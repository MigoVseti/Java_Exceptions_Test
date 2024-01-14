package Exception.Ex5;

public class MassExep {
    public static void main(String[] args) {
        Integer[] mass = new Integer[]{};
        for(int i:mass){
            if (i<0 || i>9){
                throw new IllegalArgumentException("Массив содержит не числовое значение");
            }
        }
        if (mass.length == 0 || mass == null){
            throw new IllegalArgumentException("Массив пустой");
        }else {
            MethodMass.sumMass(mass);
        }
    }
}
