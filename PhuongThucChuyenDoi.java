
public class PhuongThucChuyenDoi {
	public static void main(String[] args) {
		String s1="Xin chào ";
		String s2="Tôi là An ";
		
		//Hàm concat -> nối chuỗi
		System.out.println(s1.concat(s2));
		
		//Hàm replaceAll -> thay thế
		String s3="Giới thiệu ";
		String s4=s1.replaceAll("chào", s3);
		System.out.println("s4 = "+s4);
		
		//Hàm toLowerCase -> chuyển về viết thường
		System.out.println("s1: "+s1.toLowerCase());
		
		//Hàm toUpperCase -> chuyển về viết hoa
		System.out.println("s1: "+s1.toUpperCase());
		
		//Hàm trim() -> xóa khoảng trắng dư thừa ở đầu chuỗi
		String s9="  xin chào mọi người    ";
		System.out.println("s9: "+s9.trim());
		
		//Hàm substring -> cắt chuỗi con
		String s10=s9.substring(0, 10);
		String s11=s9.substring(10);
		System.out.println("s10: "+s10);
		System.out.println("s11: "+s11);
	}

}
