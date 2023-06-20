package basic.bai1;

import java.util.Scanner;

public class MyMainClass {
	public static void main(String[] args) {
		CalculateUtils c = new CalculateUtils();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập số thứ nhất x = ");
		double x = scanner.nextDouble();

		System.out.print("Nhập số thứ hai y = ");
		double y = scanner.nextDouble();

		System.out.print("Nhập lệnh ACTION = ");
		String action = scanner.next();

		double result = 0;
		boolean non_result=true;

		switch (action.toUpperCase()) {
		case "CONG":
			result = c.tinhCong(x, y);
			break;
		case "TRU":
			result = c.tinhTru(x, y);
			break;
		case "CHIA":
			result = c.tinhChia(x, y);
			break;
		case "NHAN":
			result = c.tinhNhan(x, y);
			break;
		default:
			System.out.println("Giá trị ACTION không hợp lệ");
			non_result=false;
			break;
		}

		
		if(non_result) {
			System.out.println("Kết quả: "+result);
		}else {
			System.out.println();
		}
	}
}
