import java.util.Scanner;

/**
 * Input Description Input will consist of one line on standard console input.
 * This line will contain first an integer N, then a floating-point number R.
 * They will be space-delimited. The integer N is for the number of sides of the
 * Polygon, which is between 3 to 100, inclusive. R will be the circumradius,
 * which ranges from 0.01 to 100.0, inclusive. Output Description Print the
 * permitter of the given N-sided polygon that has a circumradius of R. Print up
 * to three digits precision.
 * 
 * Sample Input 1 5 3.7 Sample Output 1 21.748 Sample Input 2 100 1.0 Sample
 * Output 2 6.282
 * 
 * @author aditya29
 * 
 */
public class PolygonPerimeter_146 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int numEdges = sc.nextInt();
		double r = sc.nextDouble();
		double perimeter = numEdges * 2 * Math.sin(Math.PI/numEdges) * r;
		System.out.printf("The perimeter of the polygon is %.4\n", perimeter);
	}
}
