
public class GeometricSummation {

	
	public static void main(String[] args)
	{ 
		
		System.out.println(GeoSum(2,7));
		
		System.out.println(GeoSum(7,7));
		
	}
	
	
	public static double GeoSum(double a,int N)
	{
		
		double sum = 1;
		
		for (int i = 0; i < N + 1; ++i)
		{
			sum *= a;
		}
		
		
		
		return sum;
	}
	
}
