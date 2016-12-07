package com.sd.io;
/**
 * ������ �� �پ� �о���� Ŭ����
 * @author Noh Ye-seul
 * @version 1.0
 * @see java.util.Scanner
 * @see java.io.File
 * @see java.io.FileNotFoundException
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class ScanFile {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(new File("test.txt"));
				while (sc.hasNext()) {
					String line = sc.nextLine();
					System.out.println(line);
				}
		} catch(FileNotFoundException e) {}
	}
}