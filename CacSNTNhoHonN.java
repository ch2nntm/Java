import java.util.Scanner;

public class CacSNTNhoHonN {
	public static int SNT(int n) {
		if(n<2) return 0;
		for(int i=2; i<n; i++)
			if(n%i==0) return 0;
		return 1;
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhập n:");
		n=sc.nextInt();
		System.out.println("Các số nguyên tố nhỏ hơn "+n+" là: ");
		for(int i=2; i<=n; i++) {
			if(SNT(i)==1)
				System.out.println(i+" ");
		}
	}

}
