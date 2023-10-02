import java.util.Arrays;

public class Array {

    private int[] array;
    private int size = 0;

    public Array() {
        array = new int[5];
    }

    private void checkSize() {
        if (array.length == size + 1) {
            int[] arrayCopy = new int[array.length];

            for (int i = 0; i < array.length; i++) {
                arrayCopy[i] = array[i];
            }

            array = new int[array.length * 2];

            for (int i = 0; i < arrayCopy.length; i++) {
                array[i] = arrayCopy[i];
            }
        }
    }

    public void add(int value) {
       checkSize();

       array[size] = value;
       size++;
       System.out.println("The array where you added the value at the end: " + Arrays.toString(array));
    }
    public void addValueInIndex(int value, int index) {
        checkSize();

        for (int i = size + 1; i > index; i--){
            array[i]=array[i - 1];
        }
        array[index]=value;

        System.out.println("An array where you added a value to a specific location: " + Arrays.toString(array));
    }

    public void remove(int removeIndex) {
        int[] newArrayRemove = new int[array.length - 1];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != removeIndex) {
                newArrayRemove[j++] = array[i];
            }
        }

        for (int i = 0; i < newArrayRemove.length; i++) {
            array[i] = newArrayRemove[i];
        }

        size--;
        System.out.println("Remove Array: " + Arrays.toString(array));
    }

    public void edit(int index, int value) {
        array[index] = value;

        System.out.println("Edit Array: " + Arrays.toString(array));
    }
}
