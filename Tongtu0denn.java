import java.util.Scanner;

public class Tongtu0denn {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, s=0;
		System.out.println("Nhập số nguyên n:");
		n=sc.nextInt();
		for(int i=0; i<=n; i++)
			s=s+i;
		System.out.println("Tổng từ 0 đến "+n+" bằng: "+s);
	}

}
