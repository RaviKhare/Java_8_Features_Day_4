package main.java.com.generics;


public class GenericIntefaceImplementor {

	public static void main(String[] str) {
		
		GenericInteface<Integer> genIntface = (n) -> {
				int fact =1;
				for (int i=0; i<=n; i++) {
						fact = fact*i;
				}
				return n;
			};
	
		int result = genIntface.compute(10);
		
		GenericInteface<String> genIntface2 = (s) -> {
			String reverse ="";
			for (int i=s.length()-1; i>=0; i--) {
					reverse = reverse+s.charAt(i);
			}
			return reverse;
		};

	String resultVal = genIntface2.compute("intel");
	
		
	}
}
