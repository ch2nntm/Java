import java.util.Scanner;

public class CacPhanTuXuatHien1Lan {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a;
		a = new int[100];
		int n;
		System.out.println("Nhập n:");
		n=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("a["+(i+1)+"]=");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Phần tử xuất hiện 1 lần trong mảng:");
		for(int i=0; i<n; i++) {
			int dem=0;
			for(int j=0; j<n; j++) {
				if(a[i]==a[j] && i!=j) dem++;
			}
			if(dem==0) System.out.println(a[i]);
		}
	}

}
