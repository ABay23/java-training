public class Main {
    public static void main(String[] args){
        Cats myCat = new Cats();
        myCat.print();
    }

    static void printThing(Printable thing){
        thing.print();
    }
}
