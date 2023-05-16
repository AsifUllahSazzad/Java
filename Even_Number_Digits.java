public class Even_Number_Digits {
    public static void main(String[] args)
    {
        int[] nums = {12,345,2,6,7896};
        int ans = findnumber(nums);
        System.out.println(ans);
    }
    public static int findnumber(int[] nums)
    {
        int count = 0;
        for(int i: nums)
        {
            if(even(i))
            {
                count++;
            }
        }
        return count;
    }
    public static boolean even(int i)
    {
        int number = digits(i);
        return number%2==0;
    }
    public static int digits(int n)
    {
        return(int) Math.log10(n)+1;
    }
}
