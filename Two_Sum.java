import java.util.Arrays;
class Two_Sum {
    public static void main(String[] args){
        int[] nums = {3,3};
        int target = 6;
        System.out.print(Arrays.toString(twoSum(nums,target)));
    }
    static int[] twoSum(int[] nums, int target) {
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                    if(nums[i]+nums[j]==target)
                    {
                        return new int[]{i,j};
                    }
                }
            }
        }
        return new int[]{0};
    }
}