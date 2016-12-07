package com.sd.io;
/**
 * 반지름을 입력하면 원의 면적을 구하는 클래스
 * @author Noh Ye-seul
 * @version 1.0
 * @see java.util.Scanner
 */
import java.util.Scanner;

public class CalcAreaMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요: ");
		double r = sc.nextDouble();
		double area = Math.PI * Math.pow(r, 2);
		
		System.out.printf("반지름: %.2f\n면적: %.2f\n", r, area);
	}
}