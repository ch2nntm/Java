import java.util.Scanner;

public class UCLN {
	/*public static void Nhap(int a, int b) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập a:");
		a=sc.nextInt();
		System.out.println("Nhập b:");
		b=sc.nextInt();
		return;
	} */
	
	public static int UCLN(int a, int b) {
		while(a!=b) {
			if(a>b) a=a-b;
			else b=b-a;
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
		//Nhap(a,b);
		System.out.println("Ước chung lớn nhất của "+a+" và "+b+" là: "+UCLN(a,b));
		System.out.println("Bội chung nhỏ nhất của "+a+" và "+b+" là: "+(a*b)/UCLN(a,b));
	}
}
