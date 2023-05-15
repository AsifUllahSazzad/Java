public class Contains_Duplicate {
    public static void main(String[] args)
    {
        int[] nums = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums)
    {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i != j)
                {
                    if(nums[i]==nums[j])
                    {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
