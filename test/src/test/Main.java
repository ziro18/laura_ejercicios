package test;

public class Main {

	public static void main(String[] args) {
		Float price1;
		Float price2;
		String priceStr1 = "123"; 
		String priceStr2 = null; 

		price1 = Float.valueOf(priceStr1);
		price2 = Float.valueOf(priceStr2);
		
		System.out.println(priceStr1);
		System.out.println(priceStr2);

	}

}
