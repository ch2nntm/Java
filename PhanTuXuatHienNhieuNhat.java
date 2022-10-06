import java.util.Scanner;

public class PhanTuXuatHienNhieuNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, a[];
		a = new int[100];
		System.out.println("Nhập n:");
		n=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("a["+(i+1)+"]=");
			a[i]=sc.nextInt();
		}
		int[] max;
		max = new int[100];
		max[0]=0;
		int Max=0;
		for(int i=0; i<n-1; i++) {
			int dem=0;
			/*int[] max;
			max = new int[100];
			max[0]=0;*/
			for(int j=i+1; j<n; j++) {
				if(a[i]==a[j]) dem++;
			}
			if(dem>max[i]) {
				max[i]=dem;
				Max=max[i];
			}
		}
		System.out.println("Phần tử xuất hiện nhiều nhất là:");
		for(int i=0; i<n; i++) {
			if(max[i]==Max) System.out.println(a[i]);
		}
	}

}
