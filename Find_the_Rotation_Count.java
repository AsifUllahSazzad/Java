//https://www.geeksforgeeks.org/find-rotation-count-rotated-sorted-array/
public class Find_the_Rotation_Count{
    public static void main(String[] args)
    {
        int[] arr = {15, 18, 2, 3, 6, 12};
        System.out.println(Rotation(arr));
    }

    //Rotation Count
    static int Rotation(int[] arr) {
        int pivot = FindPivot(arr);
        if (pivot == -1)
        {
            //array is not rotated
            return 0;
        }
        return pivot+1;
    }

    //find pivot duplicate element
    static int FindPivotDuplicate(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(end>mid && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(start<mid && arr[mid-1]>arr[mid])
            {
                return mid-1;
            }
            else if(arr[start]==arr[mid] && arr[end]==arr[mid])
            {
                if(arr[start]>arr[start+1])
                {
                    return start;
                }
                start++;
                if(arr[end]<arr[end-1])
                {
                    return end-1;
                }
                end--;
            }
            else if(arr[start]<arr[mid] || (arr[start]==arr[mid] && arr[end]<arr[mid]))
            {
                start = mid+1;
            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    //find pivot non-duplicate element
    static int FindPivot(int[] arr)
    {
        int start = 0;
        int end = arr.length-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(start<mid && arr[mid]<arr[mid-1])
            {
                return mid-1;
            }
            else if(end>mid && arr[mid]>arr[mid+1])
            {
                return mid;
            }
            else if(arr[start]>=arr[mid])
            {
                end = mid-1;
            }
            else if(arr[start]<arr[mid])
            {
                start = mid+1;
            }
        }
        return -1;
    }
}