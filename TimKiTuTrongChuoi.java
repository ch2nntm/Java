import java.util.Scanner;
import java.io.*;

public class TimKiTuTrongChuoi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String chuoi;
		char kitu='t';
		System.out.println("Nhập chuỗi:");
		chuoi=sc.nextLine();
		System.out.println("Moi ban nhap 1 ky tu");
		kitu =sc.nextLine().charAt(0);
			int m=chuoi.length();
		char mang[]=chuoi.toCharArray();
		boolean kq=false;
		for(int i=0; i<m; i++)
			if(mang[i]==kitu)
				kq=true;
		System.out.println("Kí tự "+kitu+" có trong chuỗi "+chuoi);
	}
}
