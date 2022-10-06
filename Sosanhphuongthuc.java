
public class Sosanhphuongthuc {
	public static void main(String[] args) {
		String s1="TITV.vn";
		String s2="titv.vn";
		String s3="titv.vn";
		
		//Hàm equals -> so sánh 2 chuỗi giống nhau, có phân biệt hoa thường
		System.out.println("S1 equals s2: "+s1.equals(s2));
		System.out.println("S2 equals s3: "+s2.equals(s3));
		System.out.println("S1 equals s3: "+s1.equals(s3));
		
		System.out.println("-----------");
		
		//Hàm equalsIgnoreCase -> so sánh 2 chuỗi, không phân biệt hoa thường
		System.out.println("S1 equalsIgnoreCase s2: "+s1.equalsIgnoreCase(s2));
		System.out.println("S2 equalsIgnoreCase s3: "+s2.equalsIgnoreCase(s3));
		System.out.println("S1 equalsIgnoreCase s3: "+s1.equalsIgnoreCase(s3));
		
		System.out.println("------------------");
		
		//Hàm compareTo -> so sánh > < =
		String sv1="Nguyễn Văn Anh";
		String sv2="Nguyễn Văn B";
		String sv3="Nguyễn Văn";
		System.out.println("sv1 compareTo sv2: "+sv1.compareTo(sv2));
		System.out.println("sv1 compareTo sv3: "+sv1.compareTo(sv3));
		System.out.println("sv2 compareTo sv3: "+sv2.compareTo(sv3));
		
		System.out.println("----------------");
		
		//Hàm compareToIgnoreCase -> so sánh nhưng không phân biệt hoa thường
		System.out.println("sv1 compareToIgnoreCase sv2: "+sv1.compareToIgnoreCase(sv2));
		System.out.println("sv1 compareToIgnoreCase sv3: "+sv1.compareToIgnoreCase(sv3));
		System.out.println("sv2 compareToIgnoreCase sv3: "+sv2.compareToIgnoreCase(sv3));
		
		System.out.println("--------------------");
		
		//Hàm regionMatches(vị trí thứ i của chuỗi 1, chuỗi 2,
		// vị trí bắt đầu của chuỗi 2, số kí tự so sánh) 
		//so sánh 1 đoạn
		String r1="TITV.vn";
		String r2="TV.v";
		boolean check=r1.regionMatches(2, r2, 0, 4);
		System.out.println("s1 regionMatches r2: "+check);
		
		System.out.println("--------------");
		
		//Hàm startWith -> Hàm kiểm tra chuỗi bắt đầu bằng........
		String sdt="037243862";
		System.out.println(sdt.startsWith("037"));
		System.out.println(sdt.startsWith("034"));
		
		System.out.println("---------------");
		
		//Hàm endWith -> Hàm kiểm tra chuỗi kết thúc bằng......
		System.out.println(sdt.endsWith("862"));
		System.out.println(sdt.endsWith("882"));
		}

}
