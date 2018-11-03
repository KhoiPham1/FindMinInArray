import java.util.Arrays;
import java.util.Scanner;

public class FindMinInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter size: ");
        int size = input.nextInt();
        int[]array = new int[size];
        for (int i =0;i<array.length;i++){
            int number = input.nextInt();
            array[i] = number;
            System.out.print(number +" ");
        }
        int min = array[0];
        for (int j=0;j<array.length;j++){
            if (min>array[j]){
                min = array[j];
            }
        }
        System.out.println("\n" +"Min element: "+ min);
    }
}
