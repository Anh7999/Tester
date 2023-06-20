package basic.bai3;

import java.util.ArrayList;
import java.util.Scanner;

public class MainScreen {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Student> data = new ArrayList<>();

		String full_Name;
		String address;
		String dob;
		String gender;
		float finalGrade = 0;
		String continute = "";
		int number = 1;

		System.out.println();
		do {
			System.out.println();
			System.out.println("Nhập Student[" + number + "]: ");

			System.out.print("Nhap fullname: ");
			full_Name = scanner.nextLine();

			System.out.print("Nhap address: ");
			address = scanner.nextLine();

			System.out.print("Nhap dob: ");
			dob = scanner.nextLine();

			System.out.print("Nhap gender: ");
			gender = scanner.nextLine();
			boolean checkNumber = true;
			do {

				try {
					System.out.print("Nhap finalGrade: ");
					finalGrade = Float.parseFloat(scanner.nextLine());
				} catch (Exception e) {
					checkNumber = false;
//					System.out.println("Nhâp sai định dạng");

				}
				if (finalGrade < 0.0 || finalGrade > 10.0) {
					System.out.println("Nhập finalGrade hợp lệ từ 0 đến 10");
				}
				
			} while (finalGrade < 0.0 || finalGrade > 10.0);
			
			Student s = new Student(full_Name, address, dob, gender, finalGrade);
			data.add(s);

			do {
				System.out.print("Do you want to continue (Y/N)? ");
				continute = scanner.nextLine().toUpperCase();
			} while (!continute.equals("Y") && !continute.equals("N"));

			number++;

		} while (continute.equals("Y"));

		int j = 0;
		for (int i = 0; i < data.size(); i++) {
			j++;
			System.out.println("\nStudent " + (j) + ": ");
			System.out.println("\tFullName: " + data.get(i).getFullName());
			System.out.println("\tAddress: " + data.get(i).getAddress());
			System.out.println("\tDOB: " + data.get(i).getDob());
			System.out.println("\tGender: " + data.get(i).getGender());
			System.out.println("\tFinalGrade: " + data.get(i).getFinalGrade());
		}

		String hocLuc = "";
		float diemTB = 0;
		float tongDiem = 0;

		System.out.println("\nXét finalGrade: ");
		for (int i = 0; i < data.size(); i++) {
			float final_grade = data.get(i).getFinalGrade();
			if (final_grade < 4.0) {
				hocLuc = "kém";
			} else if (final_grade >= 4.0 && final_grade < 5.0) {
				hocLuc = "yếu";
			} else if (final_grade >= 5.0 && final_grade < 5.5) {
				hocLuc = "trung bình yếu";
			} else if (final_grade >= 5.5 && final_grade < 6.5) {
				hocLuc = "trung bình";
			} else if (final_grade >= 6.5 && final_grade < 7.0) {
				hocLuc = "trung bình khá";
			} else if (final_grade >= 7.0 && final_grade < 8.0) {
				hocLuc = "khá";
			} else if (final_grade >= 8.0 && final_grade < 8.5) {
				hocLuc = "khá giỏi";
			} else if (final_grade >= 8.5 && final_grade <= 10) {
				hocLuc = "giỏi";
			}
			tongDiem += final_grade;
			diemTB = tongDiem / data.size();

			System.out.println("Học sinh " + data.get(i).getFullName() + " học lực " + hocLuc);

		}
		System.out.println("\nĐiểm tổng kết trung bình của danh sách học sinh: " + diemTB);

	}
}
