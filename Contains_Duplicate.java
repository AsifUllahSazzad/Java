public class Contains_Duplicate {
    public static void main(String[] args)
    {
        int[] nums = {237384,237384};
        System.out.println(containsDuplicate(nums));
    }
    public static boolean containsDuplicate(int[] nums)
    {
        if(1<=nums.length || nums.length<=Math.pow(10,5)) {
            for (int i = 0; i < nums.length; i++) {
                if(-Math.pow(10,9)<=nums[i] || nums[i]<=Math.pow(10,9)){
                for (int j = 0; j < nums.length; j++) {
                    if (i != j) {
                        if (nums[i] == nums[j]) {
                            return true;
                        }
                    }
                }
                }
            }
        }
        return false;
    }
}
