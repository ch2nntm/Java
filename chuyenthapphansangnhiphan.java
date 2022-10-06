import java.util.Scanner;

public class chuyenthapphansangnhiphan {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Nhập số thập phân: ");
		n=sc.nextInt();
		
		String nhiphan = "";
		while(n>0) {
			nhiphan = n%2 + nhiphan;
			n=n/2;
		}
		System.out.println("Hệ nhị phân là: "+nhiphan);
	}
}
