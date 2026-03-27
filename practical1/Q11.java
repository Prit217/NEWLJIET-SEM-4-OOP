
class ArrayOperations 
{

    // Add all elements
    static int add(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    // Find maximum element
    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Search element
    static int search(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;   // return index
            }
        }
        return -1;  // if not found
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = {10, 25, 5, 40, 15};

        System.out.println("Sum = " + add(arr));
        System.out.println("Max = " + max(arr));

        int result = search(arr, 25);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
