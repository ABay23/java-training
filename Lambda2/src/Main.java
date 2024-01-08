import java.util.ArrayList;
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
    }
    public static<T> T calculator(Operation<T> function, T value1, T value2 ){
        T result = function.operate( value1,  value2);
        System.out.println("Function Result: " + result);
        return result;
    };
}
