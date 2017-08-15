public class FizzBuzz {
	 public static void main(String[] args) {
		 
		 int[] testNums = {3, 5, 7, 11, 13};
		 String[] responseStrings = {"Fizz", "Buzz", "Fuzz", "Bizz", "Biff"};
		 String output;
		 
		 for(int i = 1; i <= 1000; i++) {
			 output = "";
			 for(int j = 0; j < testNums.length; j++) {
				 if(i % testNums[j] == 0) {
					 output += responseStrings[j];
				 }
			 }
			 if(output != "") {
				 System.out.println(output);
			 } else {
				 System.out.println(i);
			 }
		 }
	 }
}
