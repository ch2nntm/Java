import java.util.Scanner;

public class SoThuanNghich {
	
	public static int SNT(String n) {
		int m=n.length();
		for(int i=0; i<m; i++) {
			if(n.charAt(i)!=n.charAt(m-i-1))
				return 0;
		}
		return 1;	
		}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String n;
		System.out.println("Nhập n:");
		n=sc.nextLine();
		if(SNT(n)==1)
			System.out.println(n+" là số thuận nghịch");
		else
			System.out.println(n+" không phải là số thuận nghịch");
	}
	}
