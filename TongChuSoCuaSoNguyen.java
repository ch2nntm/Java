import java.util.Scanner;

public class TongChuSoCuaSoNguyen {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, s=0;
		System.out.println("Nhập n:");
		n=sc.nextInt();
		while(n>0) {
			int sd;
			sd=n%10;
			s=s+sd;
			n=n/10;
		}
		System.out.println("Tổng các chữ số của số "+n+" bằng: "+s);
	}

}
