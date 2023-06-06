// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
import java.util.Arrays;

public class Two_Sum_II {
    public static void main(String[] args)
    {
        int[] numbers = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(numbers,target)));
    }
    public static int[] twoSum(int[] numbers,int target)
    {
        int low =0;
        int high = numbers.length-1;
        while(low<high)
        {
            int start = numbers[low];
            int end = numbers[high];
            if(start+end==target)
            {
                return new int[]{low+1,high+1};
            }
            else if(start+end>target)
            {
                high--;
            }
            else{
                low++;
            }
        }
        return new int[]{-1,-1};
    }
}
