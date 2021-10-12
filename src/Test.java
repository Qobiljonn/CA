import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
    int[] array = {10,2,1,6,8,3,7};
    QuickSort.quickSort(array,0,array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
