package ro.usv.rf;

public class DistanceUtils {
	private static double calculateDistance(String[] currentPattern, double[] otherPattern)
	{
		double sum = 0;
		for (int i = 0; i < currentPattern.length; i++ )
		{
			sum += Math.pow((Double.valueOf(currentPattern[i])- otherPattern[i]), 2);
		}
		return Math.sqrt(sum);
	}
	
	private static double calculateDistance(String[] currentPattern, String[] kernel)
	{
		double sum = 0;
		for (int i = 0; i < currentPattern.length; i++ )
		{
			sum += Math.pow((Double.valueOf(currentPattern[i])- Double.valueOf(kernel[i])), 2);
		}
		return Math.sqrt(sum);
	}
	private static String[] updateKernel(String[][] entrySet, double[] centerOfGravity)
	{
		double minDistance = Double.MAX_VALUE;
		int closestPattern = 0;
		for (int i = 0; i<entrySet.length; i++)
		{
			double distanceToKernel = calculateDistance(entrySet[i], centerOfGravity);
			if (distanceToKernel < minDistance)
			{
				minDistance = distanceToKernel;
				closestPattern = i;
			}
				
		}
		return entrySet[closestPattern];
	}

}
