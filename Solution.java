class Solution {
    public static void main(String[] args)
    {
        int[] arr = {12,345,2,6,7896};
        int ans = findnumber(arr);
        System.out.println(ans);
    }
    static int findnumber(int[] arr)
    {
        int count = 0;
        for(int i: arr)
        {
            if(even(i))
            {
                count++;
            }
        }
        return count;
    }

    static int digitnumber(int n)
    {
        int count = 0;
        while(n>0)
        {
            count++;
            n = n/10;
        }
        return count;
    }

    static boolean even(int num)
    {
        int ans = digitnumber(num);
        return ans%2==0;
    }
}