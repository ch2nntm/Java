import java.util.Scanner;

public class SoLonNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a;
		int n;
		a = new int[100];
		System.out.println("Nhập số phần tử: ");
		n=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("a["+(i+1)+"]=");
			a[i]=sc.nextInt();
		}
		int max=a[0];
		for(int i=1; i<n; i++)
			if(a[i]>max)
				max=a[i];
		System.out.println("Số lớn nhất là: "+max);
	}

}
