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
        switch(month) {
            case "January":
            case "February":
            case "March":
                return "1st";
            case "April":
            case "May":
            case "June":
                return "2nd";
            case "July":
            case "August":
            case "September":
                return "3rd";
            case "October":
            case "November":
            case "December" :
                return "4th";
        }
        return "Bad";
    }
}
