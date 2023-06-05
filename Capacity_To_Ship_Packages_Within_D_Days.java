// https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
public class Capacity_To_Ship_Packages_Within_D_Days{
    public static void main(String[] args)
    {
        int[] weights = {3,2,2,4,1,4};
        int days = 3;
        System.out.println(shipWithinDays(weights,days));
    }
    public static int shipWithinDays(int[] weights,int days)
    {
        int low = 0;
        int high = 0;
        for(int i=0;i<weights.length;i++)
        {
            low = Math.max(low,weights[i]);
            high+=weights[i];
        }
        while(low<high)
        {
            int mid = low+(high-low)/2;
            int sum=0;
            int piece=1;
           for(int i=0;i<weights.length;i++)
           {
               if(sum+weights[i]>mid)
               {
                   sum = weights[i];
                   piece++;
               }
               else{
                   sum+=weights[i];
               }
           }
           if(piece>days)
           {
               low = mid+1;
           }
           else{
               high = mid;
           }
        }
        return high;
    }
}