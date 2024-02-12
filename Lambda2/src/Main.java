import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){

        List<String> list = new ArrayList<>(List.of(
                "Mac", "Kelly", "Peter", "Mark"
        ));
        for(String p : list){
            System.out.println(p);
        }
        System.out.println("-------------------");
        list.forEach((s)-> System.out.println(s));

        int result = calculator((a, b) -> a + b, 5, 7);
        var result2 = calculator((a, b)-> a / b , 200.5, 3.2);
        var result3 = calculator((a, b) -> a / b, 500.1, 2.0);
        var supList = Arrays.asList(
                new double[]{47.2160, -34.2233},
                new double[]{33.234, -4.590},
                new double[]{35.982, -90.334});
        supList.forEach( x -> System.out.println(Arrays.toString(x)));
    }
    public static<T> T calculator(Operation<T> function, T value1, T value2 ){
        T result = function.operate( value1,  value2);
        System.out.println("Function Result: " + result);
        return result;
    };
}
