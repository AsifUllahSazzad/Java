import java.util.Arrays;
public class TwoD_Matrix_Full_Sorted{
    public static void main(String[] args)
    {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 3;
        System.out.println(Arrays.toString(binarySearch(matrix,target)));
    }
    public static int[] binarySearch(int[][] matrix,int target)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = (rows*cols)-1;
        while(start<=end)
        {
            int mid = start+(end-start)/2;
            if(target<matrix[mid/cols][mid%cols])
            {
                end = mid-1;
            }
            else if(target>matrix[mid/cols][mid%cols])
            {
                start = mid+1;
            }
            else{
                return new int[]{mid/cols,mid%cols};
            }
        }
        return new int[]{-1,-1};
    }
}