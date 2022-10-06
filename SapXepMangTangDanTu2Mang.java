import java.util.Scanner;

public class SapXepMangTangDanTu2Mang {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a;
		int[] b;
		int n,m;
		a=new int[100];
		b=new int[100];
		System.out.println("Nhập n phần tử của mảng a:");
		n=sc.nextInt();
		for(int i=0; i<n; i++) {
			System.out.println("a["+(i+1)+"]=");
			a[i]=sc.nextInt();
		}
		
		System.out.println("Nhập m phần tử của mảng b:");
		m=sc.nextInt();
		for(int i=0; i<m; i++) {
			System.out.println("b["+(i+1)+"]=");
			b[i]=sc.nextInt();
		}
		int[] c;
		c=new int[200];
		for(int j=0; j<n; j++) {
			c[j]=a[j];
		}
		for(int j=n; j<(n+m); j++) {
			c[j]=b[j-n];
		}
		for(int j=0; j<(m+n-1); j++) {
			for(int k=j+1; k<(m+n); k++) {
				if(c[j]>c[k]) {
					int swap=c[j];
					c[j]=c[k];
					c[k]=swap;
			}
			}
		}
		System.out.println("Sau khi gộp 2 mảng thì có mảng được sắp xếp như sau:");
		for(int j=0; j<(m+n); j++)
			System.out.println(c[j]);
	}
}
