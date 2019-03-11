import java.util.Scanner;
public class Calc {
	public static void main(String args[]){
		Scanner Omar = new Scanner(System.in);
		// we can use int instead of doub and the result of
		// getting division will  be rounded down.
		double Fnum, Snum, Sum, Rem, Mul, Div;
		int Exc;
		System.out.println("Enter First #:");
		Fnum = Omar.nextDouble();
		System.out.println("Enter Second #:");
		Snum = Omar.nextDouble();
		Sum = Fnum + Snum;
		Mul = Fnum * Snum;
		Div = Fnum / Snum;
		Rem = Fnum % Snum;
		System.out.println(Sum);
		System.out.println(Mul);
		System.out.println(Div);
		System.out.println(Rem);
		}
}
