package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner = new Scanner(System.in);
        /**
         * 9.1 Viết chương trình nhập vào một số nguyên. Kiểm tra số đó nguyên dương 
         * hay nguyên âm. In ra màn hình kết quả 
         */

		System.out.println("nhập cạnh n");
		int n = sc.nextInt();
		if (n > 0) {
			System.out.println("đây là số dương");
	    }else {
        if (n != 0) {		
		    System.out.println("đây là số nguyên âm");
		}
	}

       /**
        * 9.2 Viết chương trình nhập vào một sốnguyên n. Kiểm tra n chia hết cho 3
        * hay 5. In kết quả ra màn hình
        */
		if(n % 3 == 0) {
			System.out.format("%d chia het cho 3", n);
		}
 		if(n % 5 == 0) {
 			System.out.format("%d chia het cho 5",n);
 		}
		/**
		 * 9.3 Viết chương trình nhập vào tháng trong năm. In ra số ngày của tháng đó
		 */
 		if(n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12)
 			System.out.println("Thang co 31 ngay");

	if(n==4||n==6||n==9||n==11)

	{
		System.out.println("thang co 30 ngay");
	}if(n==2)
	{
		System.out.println("thang co 28 ngay");
	}

	/**
	 * 9.5 Viết chương trình nhập vào 3 số a, b, c. Kiểm tra có phải là 3
	 * cạnh của một tam giác không?
	 */
	System.out.println("Canh a");
	int a = sc.nextInt();

	System.out.println("Canh b");
	int b = sc.nextInt();

	System.out.println("Canh c");

	int c = sc.nextInt();

	if(a+b>c&&a+c>b&&b+c>a)

	{
		System.out.println("day la 3 canh cua 1 tam giac");
	}else
	{
		System.out.println("day khong phai 3 cạnh cua 1 tam giac");
	}
	}

}
