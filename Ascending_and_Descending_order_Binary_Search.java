public class Ascending_and_Descending_order_Binary_Search {
    public static void main(String[] args)
    {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 22;
        System.out.println(binarysearch(arr,target));
    }
    public static int binarysearch(int[] arr,int target)
    {
        int start = 0,end = arr.length-1;
        while(start<=end) {
            int mid = start+(end-start)/2;

            //Array Ascending:
        if (arr[start] < arr[end]) {
                if(target>arr[mid])
                {
                    start = mid+1;
                }
                else if(target<arr[mid]){
                    end = mid-1;
                }
                else{
                    return mid;
                }
        }

        //Array Descending:
        else{
            if(target>arr[mid])
            {
                end = mid-1;
            }
            else if(target<arr[mid])
            {
                start = mid+1;
            }
            else{
                return mid;
            }
        }
    }
        return -1;
    }
}
