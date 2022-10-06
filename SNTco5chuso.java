import java.util.Scanner;

public class SNTco5chuso {
	public static int SNT(int n) {
		if(n<2) return 0;
		for(int i=2; i<n; i++)
			if(n%i==0) return 0;
		return 1;
	}
	
	public static int SoChuSo(int n) {
		int dem=0;
		int s=0;
		while(n!=0) {
			//int s=0;
			s=s+n%10;
			//dem++;
			n=n/10;
		}
		return s;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Nhập n:");
		n=sc.nextInt();
		System.out.println("Số nguyên tố có 5 chữ số:");
		for(int i=10000; i<99999; i++) {
			if(SNT(i)==1 && SoChuSo(i)==n)        
				System.out.println(i); 
			}
	}
}