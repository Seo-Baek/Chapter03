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
		for(int j = 0; j < length; j++) {
			result2[(int)j] = (int)d2[j];
		}
		return result2;
	}

	
	public static int[] concat(int[] a3, int[] a4) {
		int length1 = a3.length;
		int length2 = a4. length;
		int length3 = length1 + length2;
		int[] result3 = new int[length1];
		int[] result4 = new int[length2];
		int[] result5 = new int[length3];
		while(true) {
			for(int i = 0; i < length1; i++ ) {
				result3[i] =  a3[i];
			}
			for(int j = 0; j < length2; j++) {
				result4[j] = a4[j];
		
			}
		result5[length3] = return4[j].concat(return3[i]);
		break;
		}
		return result5;
			
		}
		
		
		
		
}//class



//		String s = String.valueOf(a3);
//		String s2 = String.valueOf(a4);
//		
//		String s3 = s.concat(s2);
//		for(int i = 0; i < length3; i++) {
//			
//		int s4 = Integer.valueOf(s3);
//		int[] result5 = new int[length3];
//		result5 = s4;
//		}
//		return int[] s4;	