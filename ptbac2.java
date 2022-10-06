import java.util.Scanner;

public class ptbac2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b,c;
		double x1,x2,delta;
		
		System.out.println("Nhập a:");
		a=sc.nextInt();
		System.out.println("Nhập b:");
		b=sc.nextInt();
		System.out.println("Nhập c:");
		c=sc.nextInt();
		
		if(a==0)
			System.out.println("Phương trình nhập dữ liệu sai");
		else {
		delta=Math.pow(b, 2)-4*a*c;
		if(delta<0)
			System.out.println("Phương trình vô nghiệm");
		else if(delta==0) {
			x1=x2=-b/(2*a);
			System.out.println("Phương trình có nghiệm kép là: x1=x2="+x1);
		}
		else {
			x1=(-b-Math.sqrt(delta))/(2*a);
			x2=(-b+Math.sqrt(delta))/(2*a);
			System.out.println("Phương trình có 2 nghiệm là: x1="+x1+" và x2="+x2);
		}
			
		}		
	}

}
