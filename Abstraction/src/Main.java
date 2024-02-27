public class Main {
    public static void main(String[] args){
//        Animal animal = new Animal( "animal", "big", 200) {
//        }
        Dog dog = new Dog("wolf", "big", 120);
        dog.makeNoise();
        doAnimalStuff(dog);
    }

    private static void doAnimalStuff(Animal animal){

        animal.makeNoise();
        animal.move("slow");
    }
}
