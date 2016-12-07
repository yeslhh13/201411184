package com.sd.io;
/**
 * 파일을 읽어오는 시도를 하는 클래스
 * @author Noh Ye-seul
 * @version 1.0
 * @see java.io.File
 * @see java.io.FileReader
 * @see java.io.FileNotFoundException
 */
import java.io.*;

public class PrintFile {
	public void print() throws FileNotFoundException {
		File f = new File("noname.txt");
		FileReader fr = new FileReader(f);
	}
	public static void main(String[] args) {
		PrintFile pf = new PrintFile();
		try {
			pf.print();
		} catch(FileNotFoundException e) {
			System.out.println("File Not Found");
		}
	}
}