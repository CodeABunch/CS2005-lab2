
public class LinearSummation {

	
	public static void main(String[] args)
	{ 
		
		System.out.println(LinearSum(2));
		
		System.out.println(LinearSum(7));
		
	}
	
	public static boolean LinearSumTest(int N, double answerToTest)
	{
		double sum = 0.5 * N * (1 + N);
		
		if (sum == answerToTest)
		{
			return true;
		}
		else {
			return false;
		}
		
	}
	
	
	public static int LinearSum(int N)
	{
		int sum = 0; 
		
		for(int i = 0; i < N + 1; i++) 
		{
			sum += i;
		}
		
		
		
		if (LinearSumTest(N, sum))
		{
			return sum;
		}
		else {
			return -1;
		}
		
		
		
		
	}
	
}
