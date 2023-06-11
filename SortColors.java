// https://leetcode.com/problems/sort-colors/
public class SortColors {
    public static void main(String[] args) {
            int[] nums = {2,0,2,1,1,0};
            sortColors(nums);
    }
    public static void sortColors(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            for (int j = 0; j < last; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
