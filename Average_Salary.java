// https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/description/
public class Average_Salary {
    public static void main(String[] args)
    {
        int[] salary = {8000,9000,2000,3000,6000,1000};
        System.out.println(average(salary));
    }
    public static double average(int[] salary) {
        int sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
            for(int i=0;i<salary.length;i++)
            {
                sum+=salary[i];
                min = Math.min(min,salary[i]);
                max = Math.max(max,salary[i]);
            }
            double average = (double)(sum-min-max)/(double)(salary.length-2);
            return average;
    }
}
