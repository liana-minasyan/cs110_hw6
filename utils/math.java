package utils;
public class math {
	public static int factorial(int n){
		if( n == 0){
			return 1;
		}
		return n*factorial(n-1);
	}
public static int  factorialloop(int n){
		int factor = 1;
		for(int i=1; i<=n ; i++){
			factor= factor*i; 	
		}
		return factor;
	}
}
