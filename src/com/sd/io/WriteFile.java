package com.sd.io;
/**
 * writes file
 * @author Noh Ye-seul
 * @version 1.0
 * @see java.io.FileWriter
 * @see java.io.IOException
 */
import java.io.FileWriter;
import java.io.IOException;
 
public class WriteFile {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("test1.txt");
			fw.write("test");
			fw.close();
		} catch (IOException e) {
		}
	}
}