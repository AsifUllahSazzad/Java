public class Floor_of_a_number {
    public static void main(String[] args)
    {
        int[] nums = {2,3,5,9,14,16,18};
        int target = 1;
        int ans = floor(nums,target);
        if(ans == -1)
        {
            System.out.println("Out of range");
        }
        else {
            System.out.println(ans);
        }
    }
    static int floor(int[] nums,int target)
    {
        if(target>nums[nums.length-1])
        {
            return -1;
        }
        int st =0,en = nums.length-1;
        while(st<=en)
        {
            int mid = st+(en-st)/2;
            if(target>nums[mid])
            {
                st = mid+1;
            }
            else if(target<nums[mid])
            {
                en = mid -1;
            }
            else{
                return mid;
            }
        }
        return en;
    }
}
