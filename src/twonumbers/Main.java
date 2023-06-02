import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main (String[] args) {

        int sum = 8;
//        int [] array = {2, 3, 7, 9}; // dont have a sum
        int [] array = {2, 3, 4, 6};

        System.out.println(canDecomposeSumInUnsortedArray(sum, array));
    }
    public static boolean canDecomposeSumInSortedArray (int sum, int[] numbers) {
        int i = 0;
        int j = numbers.length - 1;

        while(i != j && j > 0) { // O(n)
            int calculatedSum = numbers[i] + numbers[j];

            if (calculatedSum == sum) {
                // numbers[i], numbers[j]
                return true;
            }

            if (calculatedSum < sum) {
                i++;
            } else {
                j--;
            }
        }

        return false;
    }

    public static boolean canDecomposeSumInUnsortedArray(int sum, int[]numbers) {

        Map<Integer, Boolean> complements = new HashMap<>();

        for (int number : numbers) {
            if (complements.get(number) != null && complements.get(number)) {
                return true;
            }

            complements.put(sum - number, true);
        }

        return false;
    }
}
