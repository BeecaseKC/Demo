import java.util.Scanner;

public class Practise2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int temp = 0, remainder =1, newNum=0;
		System.out.println("Please enter an integer.");
		int num = in.nextInt();
		int power = totalNumberOfDigits(num);
		System.out.println("the number of digits is"+" "+power);
		while(num > 0 ){
			temp = num;
			remainder = num % 10;
			System.out.println("remainder is"+" "+remainder);
			remainder =(int)Math.pow(remainder,power);
			newNum = newNum + remainder;
			System.out.println("new number is:"+" "+newNum);
			num = num/10;
		}

		if (temp == newNum) {
			System.out.println("the given number is armstrong");	
		}
		else{
			System.out.println("the given number is not armstrong");
		}

		in.close();
	}
	public static int totalNumberOfDigits(int n) {
		char[] digit = Integer.toString(n).toCharArray();
		return digit.length;
	}
}
