package laura.test;

import java.util.Arrays;

public class a {
	public static void main(String[] args) {

		int[] random = { 1, 0, 4, 3, 5, 10, 8, 9, 2, 6, 7 };

		System.out.println(Arrays.stream(random).filter(x -> x == 0).findFirst().orElse(-1));
	}
	
	public static int[] sortTwoList (int [] list1, int [] list2) {
		
		int [] retorno = new int [list1.length + list2.length];
		
		System.arraycopy(list1, 0, retorno, 0, list1.length);
		System.arraycopy(list2, 0, retorno, list1.length, list2.length);
		sortList(retorno);
		printList(retorno);
		return retorno;		
	}
	
	public static int[] sortList (int [] list) {
		int value;
		
		for(int i = 0; i < list.length; i++) {
			for(int j = i+1; j <= list.length-1; j++) {
				if(list[j] < list[i]) {
					value = list[i];
					list[i] = list[j];
					list[j] = value;
				}
			}			
		}
		return list;
	}
	
	public static void printList (int [] list) {
		for(int i = 0; i < list.length; i++) {
			System.out.println(list[i]);
		}
	}
}
