import java.util.Scanner;

public class Shapes {
 
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int length,breadth;
		System.out.println("Please enter the shape to get the area. ");
		String option = in.nextLine();
		switch (option.toLowerCase()) {
		case "triangle":
			System.out.println("please give the length and breadth.");
			 length = in.nextInt();
		 breadth = in.nextInt();
			System.out.println("The area of the triangle is:"+" "+triangle(length,breadth));
			break;
		case "rectangle":
			System.out.println("please give the length and breadth.");
		 length = in.nextInt();
			 breadth = in.nextInt();
			System.out.println("The area of the rectangle is:"+" "+rectangle(length,breadth));
			break;
		case "square":
			System.out.println("please give the length.");
		 length = in.nextInt();
				System.out.println("The area of the square is:"+" "+square(length));
			break;
	default:
		System.out.println("Invalid option.");
			break;
		}
		
		
		in.close();
		
	}
public static int triangle(int length, int breadth){
	int area = (length * breadth)/2;
	return area;
}
public static int rectangle(int length, int breadth){
	int area = length * breadth;
	return area;
}
public static int square(int length){
	int area = length * length;
	return area;
}
}
