package calendar;

import java.util.Scanner;

public class CalendarMain {

	public static void main(String[] args) {
		
		// 1. �Է¹��� ������ ���� ���ϴ� ���α׷� �ۼ��ϱ�
		
//		System.out.println("�� ���� �Է��ϼ���:");
//		Scanner scanner = new Scanner(System.in);
//		
//		String value = scanner.nextLine();
//		System.out.println(value);
//		
//		String[] values = value.split(" ");
//		
//		int first = Integer.parseInt(values[0]);
//		int second = Integer.parseInt(values[1]);
//		int result = first + second;
//		
//		System.out.println("�μ��� ���� "+  result + "�Դϴ�." );

		
		//2. �Է¹��� ���� �ִ� �ϼ� ����ϱ�
		// 31�� : 1,3,5,7,8,10,12��    30��: 4,6,9,11��     28��: 2��
		
		System.out.println("���� �Է��ϼ���:");
		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();
		int month = Integer.parseInt(value);
		
		int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int maxDay = maxDays[month-1];
		
		System.out.println(month + "���� " + maxDay +"�ϱ��� �ֽ��ϴ�.");
		
//		int[] day31 = {1,3,5,7,8,10,12};
//		int[] day30 = {4,6,9,11};
//		int[] day28 = {2};
//		int days = 0;
//		
//		for(int i=0 ; i <day31.length; i++){
//			if (month == day31[i]){
//				days=31;
//			} 
//		}
//		
//		for(int i=0 ; i <day30.length; i++){
//			if (month == day30[i]){
//				days=30;
//			} 
//		}
//		
//		for(int i=0 ; i <day28.length; i++){
//			if (month == day28[i]){
//				days=28;
//			} 
//		}
//
//		System.out.println(month + "���� " + days +"�ϱ��� �ֽ��ϴ�.");
//		
		
		
		
		
		
		
	}

}
