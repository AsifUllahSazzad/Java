// Find position of an element in a sorted array of infinite numbers
public class Find_position_of_an_element_in_a_sorted_array_of_infinite_numbers{
    public static void main(String[] args)
    {
        int[] nums = {2,3,5,6,7,8,9,10,11,12,15,20,23,30};
        int target = 20;
        System.out.println(range(nums,target));
    }
    static int range(int[] nums,int target)
    {
        //Range
        int start = 0;
        int end = 1;
        while(target>nums[end])
        {
            int newstart = end+1;
            end = end+(end-start+1)*2;
            start = newstart;
        }
        return BinarySearch(nums,target,start,end);
    }
    static int BinarySearch(int[] nums,int target,int start,int end)
    {
        //Binary search
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
                return mid;
            }
        }
        return -1;
    }
}