public class Dog {
//    private static String name; // As Static overwrites the name in all instances
    private final String name;
    public Dog(String name){
        this.name = name;
    }
     public void printName(){
        System.out.println("Name: " + name);
     }
}
