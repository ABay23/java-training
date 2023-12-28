public class Main {
    static public void main(String[] args){

       Animal animal = new Animal("Generic Animal", "Huge", 400);
       doAnimalStuff(animal, "Slow");

       Dog dog = new Dog();
       doAnimalStuff(dog, "Fast");

       Dog yorkie = new Dog("Yorkie", 15);
       doAnimalStuff(yorkie, "slow");

       Dog retriever = new Dog("Labrador Retriever", 65, "Floppy", "Swimmer");
       doAnimalStuff(retriever, "fast");
    }
    public static void doAnimalStuff(Animal animal, String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}
