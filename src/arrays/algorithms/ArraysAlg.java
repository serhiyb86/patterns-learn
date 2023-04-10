package arrays.algorithms;

import java.util.Arrays;
import java.util.Random;

public class ArraysAlg {

    public static void main(String[] args) {
        int[] nums = {10, 0, 0, 5, 3, 1, 16};
        sortSelection(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(binarySearch(nums, 5));
        shuffleArray(nums);
        System.out.println(Arrays.toString(nums));
    }

    private static void shuffleArray(int[] nums) {
        Random random = new Random();
        for (int i = 0; i < nums.length; i++) {
            int j = random.nextInt(nums.length);
            int temp;
            temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }
    }

    private static int binarySearch(int[] nums, int i) {
        int first = 0;
        int last = nums.length - 1;
        int middle;

        while (first <= last) {
            middle = (first + last) / 2;
            if (nums[middle] == i)
                return middle;
            if (nums[middle] > i)
                last = middle - 1;
            if (nums[middle] < i)
                first = middle + 1;
        }
        return -1;
    }

    private static void sortSelection(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int temp;
                if (nums[j] < nums[i]) {
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
    }

}
