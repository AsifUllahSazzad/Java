// https://leetcode.com/problems/search-in-rotated-sorted-array/description/
public class Search_in_Rotated_Sorted_Array{
    public static void main(String[] args)
    {
        int[] nums = {3,1};
        int target = 1;
        System.out.println(search(nums,target));
    }
    static int search(int[] nums,int target)
    {
        int pivot = findPivot(nums);
        if(pivot == -1)
        {
            //if we didn't find a pivot, it means the array is not rotated
            return BinarySearch(nums,target,0,nums.length-1);
        }

        //if pivot equal to target
        if(nums[pivot] == target)
        {
            return pivot;
        }

        //Search Left Side Array
        else if(target>=nums[0])
        {
            return BinarySearch(nums,target,0,pivot-1);
        }

        //Search Right Side Array
            return BinarySearch(nums, target, pivot + 1, nums.length-1);
    }

    static int BinarySearch(int[] nums,int target,int start,int end)
    {
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target>nums[mid])
            {
                start = mid+1;
            }
            else if(target<nums[mid])
            {
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }

    static int findPivot(int[] nums)
    {
        int start = 0;
        int end = nums.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(mid<end && nums[mid]>nums[mid+1])
            {
                return mid;
            }
            if(mid>start && nums[mid-1]>nums[mid])
            {
                return mid-1;
            }
            if(nums[start]>=nums[mid])
            {
                end = mid-1;
            }
            if(nums[start]<=nums[mid])
            {
                start = mid+1;
            }
        }
        return -1;
    }
}