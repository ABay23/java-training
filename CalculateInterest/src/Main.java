public class Main {
    public static void main(String[] args){
        int counter = 5;
        for (int i = 0; i < counter; i ++){
            System.out.println(i);
        }
        for (double rate = 2.0; rate <= 5.0; rate ++) {
            System.out.println("10,000 at " + rate + " interest = " + calculateInterest(10000.0, rate));

        }

    }
    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
