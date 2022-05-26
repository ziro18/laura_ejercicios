package laura.test;

import java.util.Arrays;

public class OpenFileExample5 {
	public static void main(String[] args) {

		int[] array1 = { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 };
		int[] array2 = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };

		int[] result = new int[array1.length + array2.length];
		
		System.arraycopy(array1, 0, result, 0, array1.length);
        System.arraycopy(array2, 0, result, array1.length, array2.length);
        
        Arrays.sort(result);
        
        System.out.println(Arrays.toString(result));
	}
}
