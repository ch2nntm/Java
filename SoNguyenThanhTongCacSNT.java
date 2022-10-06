

import java.util.Scanner;
public class SoNguyenThanhTongCacSNT {
    public static int SNT(int n) {
    	if(n<2) return 0;
    	for(int i=2; i<n/2; i++)
    		if(n%i==0) return 0;
    	return 1;
    	
    }
    

    public static void main(String[] args) {
    	int n;
    	Scanner sc = new Scanner(System.in);
    	System.out.print("Nhập n:");
        n=sc.nextInt();
        int i=2;
        System.out.println("Số "+n+" bằng:");
        while(n>1){
            if(SNT(i)==1){
                if(n%i==0){
                    System.out.print(i+".");
                    n/=i;
                }
                else i++;
            }
            else i++;
    }
    }
}
