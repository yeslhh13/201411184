package com.sd.io;
/**
 * �������� �Է��ϸ� ���� ������ ���ϴ� Ŭ����
 * @author Noh Ye-seul
 * @version 1.0
 * @see java.util.Scanner
 */
import java.util.Scanner;

public class CalcAreaMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ���: ");
		double r = sc.nextDouble();
		double area = Math.PI * Math.pow(r, 2);
		
		System.out.printf("������: %.2f\n����: %.2f\n", r, area);
	}
}