//given an array count no of an element having at least one grater than itself.
class Main {
    public static void main(String[] args) {

        int[] arr = { 3, 1, 4, 2 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int countMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                countMax++;
            }
        }
        int result = arr.length - countMax;
        System.out.println(result);
    }
}
// psuedocode:
// 1. Initialize an array with given elements.
// 2. Set a variable 'max' to the first element of the array.
// 3. Loop through the array to find the maximum element.
// 4. Initialize a counter 'countMax' to zero.
// 5. Loop through the array again to count how many times the maximum element
// appears.
// 6. Calculate the result by subtracting 'countMax' from the total length of
// the array.
