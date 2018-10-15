package Leetcode_problems;

public class problem_nth_digit {

    public int findNthDigit(int n) {
        
        
        int noofdigits = 1;
        int count = 9;
        while((n - count) > 0)
        {
            ++noofdigits;
            count  = count + (noofdigits*9*(10^(noofdigits-1)));
            
        }
        
        count = count - (noofdigits*9*(10^(noofdigits-1)));
        int rem = n - count;
    
        rem  = 10^(noofdigits-1) + (rem/noofdigits) ;
        String s = Integer.toString(rem);
        return Character.getNumericValue(s.charAt((rem) % noofdigits));
        
    }
    
	public static void main(String[] args) {
		
		problem_nth_digit  p1 = new problem_nth_digit();
		System.out.println(10^1);
		System.out.println(p1.findNthDigit(3));
		

	}

}
