import java.util.Scanner;

public class SoNhoNhat {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		int[] a;
		a = new int[100];
		System.out.println("Nhập n:");
		n=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("a["+(i+1)+"]=");
			a[i]=sc.nextInt();
		}
		int min=a[0];
		for(int i=1; i<n; i++)
			if(a[i]<min)
				min=a[i];
		System.out.println("Số nhỏ nhất: "+min);
	}

}
