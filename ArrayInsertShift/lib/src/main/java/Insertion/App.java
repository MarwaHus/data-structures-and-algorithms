package Insertion;
public class App {
    public static void main(String[] args) {
        int[] newArray = {8,4,23,42,16,15};
        int[] sortedArray = InsertionSort.sort(newArray);

        System.out.println("Sorted Array: ");
        for (int i = 0; i < sortedArray.length; i++) {
            System.out.print(sortedArray[i] + " ");
        }
    }
}