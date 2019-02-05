package calendar;

import java.util.Scanner;

public class CalendarMain {

	public static void main(String[] args) {
		
		// 1. 입력받은 숫자의 합을 구하는 프로그램 작성하기
		
//		System.out.println("두 수를 입력하세요:");
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
//		System.out.println("두수의 합은 "+  result + "입니다." );

		
		//2. 입력받은 월의 최대 일수 출력하기
		// 31일 : 1,3,5,7,8,10,12월    30일: 4,6,9,11월     28일: 2월
		
		System.out.println("달을 입력하세요:");
		Scanner scanner = new Scanner(System.in);
		String value = scanner.nextLine();
		int month = Integer.parseInt(value);
		
		int[] maxDays = {31,28,31,30,31,30,31,31,30,31,30,31};
		
		int maxDay = maxDays[month-1];
		
		System.out.println(month + "월은 " + maxDay +"일까지 있습니다.");
		
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
//		System.out.println(month + "월은 " + days +"일까지 있습니다.");
//		
		
		
		
		
		
		
	}

}
