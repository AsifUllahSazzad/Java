//https://leetcode.com/problems/search-insert-position/description/
public class Search_Insert_Position {
    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 6};
        int target = 2;
        System.out.println(searchInsert(nums,target));
    }

    public static int searchInsert(int[] nums, int target) {
        int st = 0, en = nums.length - 1;
        int mid = 0;
        while (st <= en) {
            mid = st + (en - st) / 2;
            if (target > nums[mid]) {
                st = mid + 1;
            } else if (target < nums[mid]) {
                en = mid - 1;
            } else {
                return mid;
            }
        }
        return st;
    }
}
