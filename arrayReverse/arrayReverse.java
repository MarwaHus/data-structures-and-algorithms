public class arrayReverse {
    public static void main(String[] args) {
        int[] numbers = {89, 2354, 3546, 23, 10, -923, 823, -12};
int[] reversed = reverseArray(numbers);
for (int num : reversed) {
    System.out.print(num + " ");
}
    }

    public static int[] reverseArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        return arr;
    }
}