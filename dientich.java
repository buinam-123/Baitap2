package Hinhchunhat;

import java.util.Scanner;

public class dientich {
	public static void main(String[] args)
	{
		System.out.println("Bài tập 2"); 
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập vào chiều dài: "); 
		int Dai = scanner.nextInt(); 
		System.out.print("Nhập vào chiều rộng: "); 
		int Rong = scanner.nextInt();
		System.out.println("Diện tích của hình chữ nhật la: " + (Dai * Rong)); 
		System.out.println("Diện tích của hình chữ nhật la: " + Math.multiplyExact(Dai, Rong));
		System.out.println("Canh có số đo lớn nhất là: " + Math.max(Dai, Rong)); 
		//Khối lập phương
		System.out.print("Nhập vào cạnh của khối lập phương: ");
		int Canh = scanner.nextInt(); 
		System.out.println("Thể tích khối lập phương la: " + Math.pow(Canh, 3)); 
		
		
		scanner.close();
	}
}
