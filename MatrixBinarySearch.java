import java.util.Arrays;
public class MatrixBinarySearch{
    public static void main(String[] args)
    {
        int[][] matrix ={{10,20,30,40},{15,25,35,45},{28,29,37,49},{33,34,38,50}};
        int target = 37;
        System.out.println(Arrays.toString(Search(matrix,target)));
    }
    public static int[] Search(int[][] matrix,int target)
    {
        int r = 0;
        int c = matrix.length-1;
        while(r<=c && c>=r)
        {
            if(target==matrix[r][c])
            {
                return new int[]{r,c};
            }
            else if(target<matrix[r][c])
            {
                c--;
            }
            else if(target>matrix[r][c])
            {
                r++;
            }
        }
        return new int[]{-1,-1};
    }
}
