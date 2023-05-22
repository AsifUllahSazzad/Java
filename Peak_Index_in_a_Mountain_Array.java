// https://leetcode.com/problems/peak-index-in-a-mountain-array/description/
public class Peak_Index_in_a_Mountain_Array{
    public static void main(String[] args)
    {
        int[] arr = {0,10,5,2};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr)
    {
        int i=0;
        while(arr[i]<arr[i+1])
        {
            i++;
        }
        return i;
    }
}