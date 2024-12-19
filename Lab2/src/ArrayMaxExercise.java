

public class ArrayMaxExercise {

	
	public static void main(String[] args)
	{   
		
		
		double[][] theArray = new double[3][3];
		
		theArray[0][0] = 8.0;
		theArray[1][0] = 6.0;
		theArray[0][1] = 3.0;
		theArray[1][1] = 6.0;
		
		System.out.println(ArrayMax(theArray));
		
		System.out.println(ArrayMin(theArray));
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	public static double ArrayMin(double[][] array)
	{
		
		
		
		
		double CurrentMin = array[0][0];
		
		for(int i = 0; i < array.length - 1; i++)
		{
			for(int j = 0; j < array[0].length - 1; j++)
			{
				
				if (array[i][j] < CurrentMin)
				{
					
					CurrentMin = array[i][j];
					
					
				}
			}
		}
		
		return CurrentMin;
		
	}
	
	
	
	public static double ArrayMax(double[][] array)
	{
		
		
		
		
		double CurrentMax = array[0][0];
		
		for(int i = 0; i < array.length - 1; i++)
		{
			for(int j = 0; j < array[0].length - 1; j++)
			{
				
				if (array[i][j] > CurrentMax)
				{
					
					CurrentMax = array[i][j];
					
					
				}
			}
		}
		
		return CurrentMax;
		
	}
	
}
