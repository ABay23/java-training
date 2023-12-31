import java.util.ArrayList;
import java.util.Arrays;

record GroceryItem(String name, String type, int count){
    public GroceryItem(String name){
        this(name, "DAIRY", 1 );
    }
}
public class Main {
    public static void main(String[] args){
        GroceryItem[] groceryArray = new GroceryItem[3];
        groceryArray[0] = new GroceryItem("Milk");
        groceryArray[1] = new GroceryItem("Apples", "Produce", 6);
        groceryArray[2] = new GroceryItem("Oranges", "Produce", 10);
        System.out.print(Arrays.toString(groceryArray));

        ArrayList<GroceryItem> groceryList = new ArrayList<>();
        groceryList.add(new GroceryItem("Butter","Dairy",4));
        groceryList.add(new GroceryItem("Bananas", "Produce",20));
        
    }
}
