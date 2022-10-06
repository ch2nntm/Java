import java.util.Scanner;

public class UCLNvaBCNN {
	/*public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Nhập a:");
		a=sc.nextInt();
		System.out.println("Nhập b:");
		b=sc.nextInt();
	}	*/
	public static int UCLN(int a, int b) {
		while(a!=b) {
			if(a<b) b=b-a;
			else a=a-b;
		}
		return a;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("Nhập a:");
		a=sc.nextInt();
		System.out.println("Nhập b:");
		b=sc.nextInt();
		System.out.println("Ước chung lớn nhất của "+a+" và "+b+" là: "+UCLN(a,b));
		System.out.println("Bội chung nhỏ nhất của "+a+" và "+b+" là: "+(a*b)/UCLN(a,b));
	}	
}
