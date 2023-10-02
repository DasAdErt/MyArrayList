import java.util.*;

public class TestClassForSorting {

    public static int[] array = new int[10];
    public static int[] sortedArray = new int[array.length];

    public static void main(String[] args) {
        fillArray();
        sorting();
    }

    private static int[] fillArray() {
        Random random = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = random.nextInt(50) - 25;
            sortedArray[i] = array[i];
        }

        System.out.println(Arrays.toString(array));

        return array;
    }

    private static int[] sorting() {
        int n = sortedArray.length;

        for (int i = 0; i < n - 1; i++){
            int minIndex = i;

            for (int j = i + 1; j < n; j++){
                if (sortedArray[j] < sortedArray[minIndex]){
                    minIndex = j;
                }
            }

            int temp = sortedArray[minIndex];
            sortedArray[minIndex] = sortedArray[i];
            sortedArray[i] = temp;
        }

        System.out.println(Arrays.toString(sortedArray));

        return sortedArray;
    }
}
