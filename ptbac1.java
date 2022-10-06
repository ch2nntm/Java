import java.util.Scanner;

public class ptbac1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Nhập a:");
		a=sc.nextInt();
		System.out.println("Nhập b:");
		b=sc.nextInt();
		if(a!=0) {
			double x;
			x=(float)-b/a;
			System.out.println("Nghiệm cần tìm bằng: "+x);
		}
		else {
			if(b==0)
				System.out.println("Phương trình có vô số nghiệm");
			else
				System.out.println("Phương trình vô nghiệm");
		}
			
	}

}
