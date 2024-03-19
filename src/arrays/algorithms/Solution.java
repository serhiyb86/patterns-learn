package arrays.algorithms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {
    public static void main(String[] args) {
//        int[] nums = {2, 7, 11, 15};
//        System.out.println(Arrays.toString(twoSum(nums, 9)));
//        System.out.println(Arrays.toString(twoSum(new int[]{3, 2, 4}, 6)));

        String arr1[] = {"Bob", "Rob", "Hob"};
        String arr2[] = {"Bob", "Rob", "Hob1", "Harry", "Bob"};
        // commonElements2(arr1, arr2);
        //distinctArray(arr2);
        Stack<String> s = new Stack<>();
        s.add("1");
        s.add("2");
        s.add("3");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int j = 0; j < nums.length; j++) {
            for (int i = 0; i < nums.length; i++) {
                if (nums[j] + nums[i] == target && j != i) {
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }

    public static String[] commonElements(String[] arr1, String[] arr2) {
        List<String> collect = Arrays.stream(arr1).filter(e -> Arrays.asList(arr2).contains(e)).toList();
        System.out.println(collect.toString());
        return null;
    }

    public static String[] commonElements2(String[] arr1, String[] arr2) {
        List<String> set = new LinkedList<>();
        for (int i = 0; i < arr1.length - 1; i++) {
            for (int i1 = 0; i1 < arr2.length; i1++) {
                if (arr1[i].equals(arr2[i1])) {
                    set.add(arr1[i]);
                    break;
                }
            }
        }
        System.out.println(set);
        return null;
    }

    public static String[] distinctArray(String [] arr) {
        int deleted = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int i1 = 0; i1 < arr.length; i1++) {
                if (i != i1 && arr[i].equals(arr[i1])) {
                    deleted++;
                    for (int i2 = i1; i2 < arr.length-1; i2++) {
                        arr[i2]=arr[i2+1];
                    }
                }
            }
        }
        String[] strings = Arrays.copyOf(arr, arr.length - deleted);
        System.out.println(Arrays.toString(strings));
        return null;
    }
}
