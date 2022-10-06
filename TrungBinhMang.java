import java.util.Scanner;

public class TrungBinhMang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a;
		int n;
		a = new int[100];
		System.out.println("Nhập số phần tử:");
		n=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("a["+(i+1)+"]=");
			a[i]=sc.nextInt();
		}
		int s=0;
		double tb;
		for(int i=0; i<n; i++)
			s=s+a[i];
		tb=(float)s/n;
		System.out.println("Trung bình của mảng a="+tb);
			
	}

}
