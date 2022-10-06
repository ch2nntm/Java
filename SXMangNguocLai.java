import java.util.Scanner;

public class SXMangNguocLai {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a;
		int n;
		a = new int[100];
		System.out.println("Nhập n:");
		n=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("a["+(i+1)+"]=");
			a[i]=sc.nextInt();
		}
		for(int i=n-1; i>=0; i--)
			System.out.println(a[i]+"\n");
	}

}
