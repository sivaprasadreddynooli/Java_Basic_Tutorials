package Leetcode_problems;

public class probelm_rotate_function {

    public int maxRotateFunction(int[] A) {
        
        
        int n = A.length;
        if (n==0)
            return 0;
       int f[] = new int[n];
        int sum = 0;
        f[0] = 0;
        for(int i=0;i<n;i++)
        {
            sum = sum+A[i];
            f[0] = f[0] + (i*A[i]);
        }
        
        int max = f[0];
        for(int j=1;j<n;j++)
        {
            f[j] = f[j-1] +  sum - ((n) * A[n-j]);
            if(f[j] > max)
            {
                max = f[j];
            }
        }
        return max;
        
    }
	
	
	public static void main(String[] args) {
		probelm_rotate_function p1 = new probelm_rotate_function();
		int A[] = {4,3,2,6};
		System.out.println(p1.maxRotateFunction(A));
		String s1 = "abcdfg";
		char ch[] = s1.toCharArray();

	}

}
