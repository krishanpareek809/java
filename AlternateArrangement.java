import java.util.*;

public class AlternateArrangement {
    public static int[] alternateArrangement(int[] arr) {
        if (arr == null || arr.length == 0) {
            return new int[0];
        }

        List<Integer> positiveElements = new ArrayList<>();
        List<Integer> negativeElements = new ArrayList<>();

        // We are separating positive and negative numbers here using this for-each loop
        for (int num : arr) {
            if (num > 0) {
                positiveElements.add(num);
            } else {
                negativeElements.add(num);
            }
        }

        int[] result = new int[arr.length];
        int i = 0;

        // Alternate between positive and negative numbers
        while (!positiveElements.isEmpty() && !negativeElements.isEmpty()) {
            result[i++] = positiveElements.remove(0);
            result[i++] = negativeElements.remove(0);
        }

        // At the end append all any other remaining positive or negative numbers
        for (int num : positiveElements) {
            result[i++] = num;
        }

        for (int num : negativeElements) {
            result[i++] = num;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int sizeOfArray = scanner.nextInt();  // Taking the input from user for array size

        int[] inputArray = new int[sizeOfArray];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < sizeOfArray; i++) {
            inputArray[i] = scanner.nextInt();
        }

        scanner.close();

        // Rearranging the array
        int[] result = alternateArrangement(inputArray);

        // Printing the result
        System.out.println("Rearranged array:");
        for (int element : result) {
            System.out.print(element + " ");
        }
    }
}


// Additional Test Cases:

// Input: [5, 3, 1, 7, 2, -6, -8, -1]
// Output: [5, -6, 3, -8, 1, -1, 7, 2]

// Input: [-2, -4, -6, -8, 1, 3, 5, 7]
// Output: [1, -2, 3, -4, 5, -6, 7, -8]

// Input: [2, 4, 6, 8]
// Output: [2, 4, 6, 8]

// Input: [-3, -1, -5, -7]
// Output: [-3, -1, -5, -7]

// Input: []
// Output: []



// Time Complexity: O(n), where n is the size of the input array.

// The initial loop that separates positive and negative numbers iterates through the input array once, which takes O(n) time.
// The loop that constructs the result array also iterates through the input array once, which takes O(n) time.
// Therefore, the overall time complexity is O(n).



// Space Complexity: O(n), primarily due to the space used for the positives and negatives ArrayLists, as well as the result array.

// The positiveElements and negativeElements ArrayLists can each store up to n/2 elements in the worst case, resulting in a total space usage of O(n).
// The result array is allocated to store the rearranged elements, which also has a space complexity of O(n).
// In summary, both the time and space complexity of the program are O(n), making it an efficient solution for rearranging the input array.