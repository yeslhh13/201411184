package com.sd.io;
/**
 * 파일을 한 줄씩 읽어오는 클래스
 * @author Noh Ye-seul
 * @version 1.0
 * @see java.io.File
 * @see java.io.FileReader
 * @see java.io.FileNotFoundException
 * @see java.io.IOException
 */
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;
 
public class ReadFile {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("test.txt");
			int i;
			while ((i = fr.read()) != -1)
				System.out.println((char)i);
			fr.close();
		} catch(FileNotFoundException e) {
		} catch(IOException e) {
		}
	}
}