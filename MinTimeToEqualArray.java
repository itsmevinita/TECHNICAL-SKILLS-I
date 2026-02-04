// Given an integer Array of size n in 1 second you can increase the value of 1 element by 1 find the minimumtime in secenod to make all element of the array.
public class MinTimeToEqualArray {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 3 };
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        int time = 0;
        for (int i = 0; i < arr.length; i++) {
            time += (max - arr[i]);
        }
        System.out.println(time);
    }
}
// observation: to minimumsise the time we need to make all elements equal to
// the maximum element of the array.
// pseudocode:
// 1. find the maximum value in the array.
// 2. how to much is needed to increase each element to make it equal .
// 3. sum all the differences .