import java.util.Scanner;

public class ChepPhat {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String cau;
		int n;
		System.out.println("Nhập câu chép phạt:");
		cau=sc.nextLine();
		System.out.println("Nhập n:");
		n=sc.nextInt();
    	for(int i=1; i<=n; i++)
			System.out.println(i+"."+cau);
	}
}
