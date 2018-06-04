package Euler;

public class BubbleSort {
    public static void main(String args[]) {
        int[] nums = new int[]{4, 1, 13, 7, 16, 9};
        bubbleSort(nums);

    }

    public static void bubbleSort(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for (int i : nums) {
            System.out.println(i);
        }


    }

}

