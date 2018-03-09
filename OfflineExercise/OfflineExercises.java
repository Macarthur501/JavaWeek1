package code;

public class OfflineExercises {

	// Given a string, return a string where
	// for every char in the original,
	// there are two chars.

	// doubleChar("The") → "TThhee"
	// doubleChar("AAbb") → "AAAAbbbb"
	// doubleChar("Hi-There") → "HHii--TThheerree"

	public String doubleChar(String input) {
		String output = "";
		for (int i = 0; i < input.length(); i++) {
			char a = input.charAt(i);
			output += a;
			output += a;
			}
		return output;
	}
	//
	// A sandwich is two pieces of bread with something in between. Return the
	// string that is between the first and last appearance of "bread" in the
	// given string, or return the empty string "" if there are not two pieces
	// of bread.

	// getSandwich("breadjambread") → "jam"
	// getSandwich("xxbreadjambreadyy") → "jam"
	// getSandwich("xxbreadyy") → ""

	public String getSandwich(String input) {
		String[] output = new String[10];
		String[] breadBin = input.split("ead");
		for (int i = 0; i < breadBin.length; i++) {
			if (breadBin[i] == "br" && breadBin[i+1].contains("br")) {
				output = breadBin[i+1].split("br");
				
			}
			}
				
			
		
		return output[0];
	}
	

	// Given three ints, a b c, one of them is small, one is medium and one is
	// large. Return true if the three values are evenly spaced, so the
	// difference between small and medium is the same as the difference between
	// medium and large.

	// evenlySpaced(2, 4, 6) → true
	// evenlySpaced(4, 6, 2) → true
	// evenlySpaced(4, 6, 3) → false

	public boolean evenlySpaced(int a, int b, int c) {
		boolean holder = false;
		if ((a + b == c)) {
			if((c - a == b)| (c - b == a)) {
				holder = true;
			}
		}
		else if(a + c == b) {
			if ((b - a == c) | (b - c == a)) {
				holder = true;
			}
		}
		else if (b + c == a) {
			if((a-b == c) | (a-c == b)) {
				holder = true;
			}
		}
		return holder;
		
		
		
		
	}

	// Given a string and an int n, return a string made of the first and last n
	// chars from the string. The string length will be at least n.

	// nTwice("Hello", 2) → "Helo"
	// nTwice("Chocolate", 3) → "Choate"
	// nTwice("Chocolate", 1) → "Ce"

	public String nTwice(String input, int a) {
		String[] balls  = input.split("");
		int b = balls.length-1;
		//System.out.println(a);
		String output = "";
		for (int i = 0; i < a; i++) {
			output += balls[i];
			//System.out.println(output);
		}
		for (int i = (balls.length - a); i <= b; i++) {
			output += balls[i];
			
		}
		
		
		return output;
	}

	// Given a string, return true if it ends in "ly".

	// endsLy("oddly") → true
	// endsLy("y") → false
	// endsLy("oddy") → false

	public boolean endsly(String input) {
		boolean condition = false;
		if (input.length() != 1) {
			String[] holder = new String[input.length()-1];
			holder = input.split("");
			
			String a = holder[holder.length-2];
			String b = holder[holder.length-1];
			if ( a.equals("l") && b.equals("y")){
				condition = true;
			}}
		
		
		return condition;
	}

	// Given a string, return recursively a "cleaned" string where adjacent
	// chars that are the same have been reduced to a single char. So "yyzzza"
	// yields "yza".

	// stringClean("yyzzza") → "yza"
	// stringClean("abbbcdd") → "abcd"
	// stringClean("Hello") → "Helo"
	public String stringClean(String input) {
		
		
		
		
		
		
		
		
		return "";
	}

	// The fibonacci sequence is a famous bit of mathematics, and it happens to
	// have a recursive definition. The first two values in the sequence are 0
	// and 1 (essentially 2 base cases). Each subsequent value is the sum of the
	// previous two values, so the whole sequence is: 0, 1, 1, 2, 3, 5, 8, 13,
	// 21 and so on. Define a recursive fibonacci(n) method that returns the nth
	// fibonacci number, with n=0 representing the start of the sequence.

	// fibonacci(0) → 0
	// fibonacci(1) → 1
	// fibonacci(2) → 1

	public int fibonacci(int input) {
		int a = 0;
		int b = 1;
		if (input == 0) {
			return 0;
			}
		else{
			for (int i = 1; i < input; i++) {
			int c = a + b;
			a = b;
			b = c;
		}
		}
		
		return b;
	}

	// We have a number of bunnies and each bunny has two big floppy ears. We
	// want to compute the total number of ears across all the bunnies
	// recursively (without loops or multiplication).
	//
	// bunnyEars(0) → 0
	// bunnyEars(1) → 2
	// bunnyEars(2) → 4

	
	//wouldve used a for loop if allowed 
	public int bunnyEars(int input) {
		int a = 0;
		int b = 6;
		if (input == 0) {
			a += 0;
		}
		else if (input == 1){
			a += 2;
		}
		else if (input == 2) {
			a += 4;
		}
		else {
			a += 6;
			b = a;
			bunnyEars(input-3);
		}
		
		return b;
	
	
	}}
