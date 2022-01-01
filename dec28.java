package dec28;

public class dec28 {
	//find Nth fibonacci number  [1st problem]
	static int a=1,b=1,c;
	
	public static void fibonacci(int N) {
		
		if(N>1) {
			c=a+b;
			System.out.print(c+"  ");
			a=b;
			b=c;
			fibonacci(N-1);
		
			
			
		}
		
		
	}
//_________________________________________________________________________________________________***
	//factorial of a number  [2nd problem]
	
	public static int fact(int num) {
		if(num==1) {
			return 1;
		}else {
			return (num*fact(num-1));
		}
		

	}

	//_______________________________________________________________________________________________***
	
	//cheak String is palindrone or not_____[3rd problrm]_________________________________________***
	static boolean palindrome(String str ,int low ,int high) {
		
		if(low>=high) {
			return true;
		}
		
		if(str.charAt(low)!=str.charAt(high)) {
			return false;
		}else {
			return palindrome(str, low+1, high-1);
		}
	}
	
	
	public static void main(String[] args) {
		System.out.print(a+" "+b+" ");
		int N=15;
		fibonacci(N-2);
//___________________________________________________________________________________________________***
		System.out.println();
		System.out.println("fact number  :"+fact(4));
		
//____________________________________________________________________________________________________***
		
		String str="NBBN";
		int low=0;
		int high=str.length()-1;
		
		if(palindrome(str, low, high)) {
			System.out.println("palindrome");
		}else {
			System.out.println("not palindrone");
		
		
	}
		
	}

}
