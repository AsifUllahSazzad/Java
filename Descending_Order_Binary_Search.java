public class Descending_Order_Binary_Search {
    public static void main(String[] args)
    {
        int[] arr = {89, 45, 22, 18, 16, 15, 4, 3, 2, 0, -4, -12, -18};
        System.out.println(binary(arr,22));
    }
    public static int binary(int[] arr,int target)
    {
        int start = 0,end = arr.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target<arr[mid])
            {
                start = mid+1;
            }
            else if(target>arr[mid])
            {
                end = mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
