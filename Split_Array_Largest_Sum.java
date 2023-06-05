// https://leetcode.com/problems/split-array-largest-sum/description/
public class Split_Array_Largest_Sum{
    public static void main(String[] args)
    {
        int[] nums = {7,2,5,10,8};
        int k = 2;
        System.out.println(splitArray(nums,k));
    }
    public static int splitArray(int[] nums,int k)
    {
        int low=0;
        int high=0;
        for(int i=0;i<nums.length;i++)
        {
            low = Math.max(low,nums[i]);
            high+=nums[i];
        }
        while(low<high)
        {
            int mid = low+(high-low)/2;
            int sum=0;
            int piece=1;
            for(int i=0;i<nums.length;i++)
            {
                if(sum+nums[i]>mid)
                {
                    sum=nums[i];
                    piece++;
                }
                else{
                    sum+=nums[i];
                }
            }
            if(piece>k)
            {
                low = mid+1;
            }
            else{
                high = mid;
            }
        }
        return high;
    }
}