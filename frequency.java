public class frequency {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 2, 3, 1, 5, 6, 7, 7, 1};

        // Find the maximum element in the array to determine the size of the frequency array
        int maxElement = arr[0];
        for (int num : arr) {
            if (num > maxElement) {
                maxElement = num;
            }
        }

        // Create an array to store element frequencies
        int[] frequencyArray = new int[maxElement + 1];

        // Calculate element frequencies
        for (int num : arr) {
            frequencyArray[num]++;
        }

        // Print the frequency of each element
        for (int i = 0; i < frequencyArray.length; i++) {
            if (frequencyArray[i] > 0) {
                System.out.println("Element " + i + " occurs " + frequencyArray[i] + " times.");
            }
        }
    }
}
