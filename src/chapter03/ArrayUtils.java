package chapter03;

public class ArrayUtils {
	public static double[] intToDouble(int[] a1) {
		int length = a1.length;
		
		double[] result = new double[length];
		for(int i = 0; i < length; i++) {
			result[i] = a1[i];
		}
	
		return result;
		
	}
	
	public static int[] doubleToInt(double[] d2) {
		int length = d2.length;
		
		int[] result2 = new int[length];
		for(double j = 0; j < length; j++) {
			result2[(int)j] = d2[j];
		}
		return result2;
	}

}//class

