// https://leetcode.com/problems/search-a-2d-matrix/description/
public class Search_a_2D_Matrix{
    public static void main(String[] args)
    {
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        System.out.println(searchMatrix(matrix,3));
    }
    public static boolean searchMatrix(int[][] matrix,int target)
    {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start =0;
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
                return true;
            }
        }
        return false;
    }
}