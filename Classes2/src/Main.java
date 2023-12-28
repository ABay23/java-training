public class Main {
    public static void main(String[] args){

        Dog rex = new Dog("Rex");
        Dog chevu = new Dog("Chevu");

        rex.printName();
        chevu.printName();

        Calculator.printSum(4, 6);
        printHello();

        for (int i = 1; i <= 5; i ++){
            LPAStudent s = new LPAStudent( "3434" + i,
                    switch(i){
                        case 1 -> "Miranda";
                        case 2 -> "Alejo";
                        case 3 -> "Nathan";
                        case 4 -> "Josmar";
                        case 5 -> "Beto";
                        default -> "Anonymous";
                    },
                    "06/07/1979",
                    "New Java Course");
//            System.out.println("Student name: " + s.name + " - " + s.id + " - " + s.dateOfBirth + " - " + s.classList);
            System.out.println(s);
        }
    }

    public static void printHello(){
        System.out.println("Hello!");
    }
}
