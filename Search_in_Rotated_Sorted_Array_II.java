// https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/?envType=list&envId=rxdpld2e
public class Search_in_Rotated_Sorted_Array_II {
    public static void main(String[] args){
        int[] nums = {2,5,6,0,0,1,2};
        int target = 0;
        System.out.println(search(nums,target));
    }

    static boolean search(int[] nums,int target)
    {
        int pivot = FindPivot(nums);
        if(pivot == -1)
        {
            return BinarySearch(nums,target,0,nums.length-1);
        }
        else if(target==nums[pivot])
        {
            return true;
        }
        else if(target>=nums[0])
        {
            return BinarySearch(nums,target,0,pivot-1);
        }
        return BinarySearch(nums,target,pivot+1,nums.length-1);
    }

    static Boolean BinarySearch(int[] nums,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid  = start+(end-start)/2;
            if(target<nums[mid])
            {
                end = mid-1;
            }
            else if(target>nums[mid])
            {
                start = mid+1;
            }
            else{
                return true;
            }
        }
        return false;
    }

    static int FindPivot(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(start<mid && nums[mid]<nums[mid-1])
            {
                return mid-1;
            }
            else if(end>mid && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            //skip duplicate value
            else if(nums[start]==nums[mid] && nums[mid]==nums[end])
            {
                if(nums[start]>nums[start+1])
                {
                    return start;
                }
                start++;
                if(nums[end]<nums[end-1])
                {
                    return end-1;
                }
                end--;
            }
            //left side sorted
            else if(nums[start]<nums[mid] || (nums[start]==nums[mid] && nums[mid]>nums[end]))
            {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }
}
