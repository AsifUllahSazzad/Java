//https://leetcode.com/problems/find-smallest-letter-greater-than-target/description/
public class Find_Smallest_Letter_Greater_Than_Target{
    public static void main(String[] args)
    {
        char[] letters = {'c','f','j'};
        char target = 'j';
        System.out.println(nextGreatestLetter(letters,target));
    }
    static char nextGreatestLetter(char[] letters, char target)
    {
        int st = 0,en = letters.length-1;
        if(target<letters[st] || target>=letters[en])
        {
            return letters[st];
        }
        while(st<=en)
        {
            int mid = st+(en-st)/2;
            if(target<letters[mid])
            {
                en = mid-1;
            }
            else
            {
                st = mid+1;
            }
        }
        return letters[st];
    }
}