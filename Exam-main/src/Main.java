
public class Main {

    public static void main(String[] args){
        Array myArray = new Array();
        myArray.add(5);
        myArray.add(7);
        myArray.add(8);
        myArray.add(155);
        myArray.add(4);
        myArray.add(1);
        myArray.addValueInIndex(15,7);
        myArray.remove(0);
        myArray.edit(0, 55);
    }
}