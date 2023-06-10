// https://leetcode.com/problems/search-a-2d-matrix-ii/description/
public class Search_2D_Matrix_II {
    public static void main(String[] args)
    {
        int[][] matrix = {{1,4,7,11,15}, {2,5,8,12,19}, {3,6,9,16,22}, {10,13,14,17,24}, {18,21,23,26,30}};
        int target = 5;
        System.out.println(searchMatrix(matrix,target));
    }
    public static boolean searchMatrix(int[][] matrix,int target)
    {
        int rows = 0;
        int cols = matrix[0].length-1;
        while(rows<matrix.length && cols>=0)
        {
            if(target<matrix[rows][cols])
            {
                cols--;
            }
            else if(target>matrix[rows][cols])
            {
                rows++;
            }
            else if(target==matrix[rows][cols]){
                return true;
            }
        }
        return false;
    }
}