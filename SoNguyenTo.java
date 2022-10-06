import java.util.Scanner;

public class SoNguyenTo {
	/*public int SNT(int n) {
		if(n<2) return 0;
		for(int i=2; i<n; i++)
			if(n%i==0) return 0;
		return 1;
	}*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhập n:");
		n=sc.nextInt();
		System.out.println("Số nguyên tố từ 1 tới "+n+": ");
		for(int i=3; i<=n; i++) {
			boolean snt=true;
			for(int j=2; j<i; j++) {
				//int snt=0;
				if(i%j==0) snt=false;
			}
			if(snt==true) System.out.println(i);
		}
	}

}
