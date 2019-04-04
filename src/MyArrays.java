import java.util.Arrays;

public class MyArrays {
    public static int sum(int[] values){
        if(values.length == 0){
            return 0;
        }
        else if(values.length == 1){
            return values[0];
        }
        else{
            int[] copy = Arrays.copyOf(values, values.length-1);
            int total = values[values.length-1];
            total = total + sum(copy);
            return total;
        }
    }
}
