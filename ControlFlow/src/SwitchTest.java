public class SwitchTest {
    public static void main(String [] args){
        int switchValue = 6;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("Caso value 3 or 4 or 5");
                System.out.println("The total value is: " + switchValue);
            }
            default -> System.out.println("Basic answer@");
        }
        String month = "October";
        System.out.println(month + " is in the " + quarter(month) + " quarter");
    }
    public static String quarter(String month){
        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4th";
            default -> "Bad";
        };
    }
}
