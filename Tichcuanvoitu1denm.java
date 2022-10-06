import java.util.Scanner;

public class Tichcuanvoitu1denm {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, m, s;
		System.out.println("Nhập số nguyên n:");
		n=sc.nextInt();
		System.out.println("Nhập số lần m:");
		m=sc.nextInt();
		s=n;
		for(int i=1; i<=m; i++)
			s=s*i;
		System.out.println("Tích của "+n+" với từ 1 đến "+m+" bằng: "+s);
	}

}
