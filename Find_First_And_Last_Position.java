// https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/
import java.util.Arrays;
public class Find_First_And_Last_Position{
    public static void main(String[] args)
    {
        int[] nums = {5,7,7,8,8,10};
        int target = 8;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }
    public static int[] searchRange(int[] nums, int target) {
        int[] ans ={-1, -1};
        int start = search(nums,target,true);
        int end = search(nums,target,false);

        ans[0] = start;
        ans[1] = end;

        return ans;

    }
    public static int search(int[] nums, int target,boolean findsearch)
    {
        int start = 0,end = nums.length-1;
        int ans=-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target<nums[mid])
            {
                end = mid-1;
            }
            else if(target>nums[mid])
            {
                start = mid+1;
            }
            else{
                ans = mid;
                if(findsearch)
                {
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}