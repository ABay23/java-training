import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args){
        int[] arr1 = new int[]{20, 22, 23, 24, 25, 30, 40};
        int[] arr2 = new int[10];

        Arrays.fill(arr2,0, 5,6);

        int maxLength = arr1.length;
        int max2 = arr2.length;
        int first = arr1[0];
        int first2 = arr2[0];
        int last2 = arr2[max2 -1];
        int last = arr1[maxLength -1];
        System.out.println("The array is " + maxLength + " numbers long and the first number is: " + first +" and the last one is: " + last);
        System.out.println("The array is " + max2 + " numbers long and the first number is: " + first2 +" and the last one is: " + last2);
        //* Original For Loop for arrays
        for (int i = 0; i < arr1.length; i ++) {
            System.out.print(arr1[i] + " ");
        }
        //* New For Each loop
        for (int j : arr1) {
            System.out.print(j + " ");
        }
        System.out.println("\n_ _ _ _ _ _");

        int[] randomArr = randomArray(10);
        for(int x: randomArr){
            System.out.print(x + " ");
        }
        Arrays.sort(randomArr);
        System.out.println('\n' +Arrays.toString(randomArr));

        int[] arr4 = Arrays.copyOf(randomArr, randomArr.length);
    }
    private static int[] randomArray(int len){
        int[] arr3 = new int[len];
        Random random = new Random();

        for( int i = 0; i < arr3.length; i++){
            arr3[i] = random.nextInt(100);
        }
        return arr3;
    }
}
