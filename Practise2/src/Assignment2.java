import java.util.Scanner;
import java.util.Random;
import java.io.*;

public class Assignment2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		/*Random ran = new Random();
		System.out.println("Please enter the lenght of the array.");
		int length = in.nextInt();
		int[] numbers = new int[length];
		for (int i = 0; i < length; i++) {
			numbers[i] = in.nextInt();		
		}
		System.out.println("---------------------");
		
		System.out.println(sortArray(numbers));
		*/
		/*
		int a = in.nextInt();
		int b = in.nextInt();
		System.out.println("a="+a+"and"+"b="+b);
		reverseA(a,b);
		reverseB(a,b);
		String name = "Beecase";
		System.out.println(name.subSequence(2, 5));
		*/
		
		System.out.println("please enter a string");
		String string = in.nextLine();
		for(int j = 1; j<= string.length(); j++)
		for (int i = 0; i+j <= string.length(); i++) {
			
			System.out.print(string.substring(i,i+j));
			System.out.print("-");
			String rev = new StringBuffer(string.substring(i,i+j)).reverse().toString();
			System.out.print(rev);
			System.out.println();
		}
		
		/*byte[] byteArray =string.getBytes();
		for (int i = 0; i < byteArray.length; i++) {
			System.out.print(byteArray[i]+" ");
		} 
		System.out.println();
		System.out.print(byteArray.toString()+" ");
		System.out.println();
		String newString =new String(byteArray);
		System.out.println(newString);
	*/
		
		
		
		
		
		in.close();
	}
	public static int sortArray(int[] array){
		int temp = 0;
		for (int i = 0; i < array.length; i++) {
			for(int j = i +1; j <array.length; j++){
				if (array[i] == array[j]) {
					/*temp = array[i];
					array[i]= array[j];
					array[j]= temp;*/
					temp = temp +1;

				}
			}

		}
		return temp;

	}
	public static void reverseA(int a, int b){
		 a=b;
		 System.out.println("a ="+" "+a);
	}
	public static void reverseB(int a, int b){
		b=a;
		System.out.println("b ="+" "+b);
	}

}
