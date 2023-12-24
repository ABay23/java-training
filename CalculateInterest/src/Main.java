public class Main {
    public static void main(String[] args){
        int counter = 5;
        for (int i = 0; i < counter; i ++){
            System.out.println(i);
        }

    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
