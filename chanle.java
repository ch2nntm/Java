import java.util.Scanner;

public class chanle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Nhập a:");
		a=sc.nextInt();
		if(a%2==0) {
			System.out.println(a+" là số chẵn");
		}
		else
			System.out.println(a+" là số lẻ");
			
	}

}
