package ������;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class Test1���� {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream(new File("C:/Users/MOFENGTAO/Pictures/����/����άȨ.docx"));
		FileOutputStream fos = new FileOutputStream(new File("C:/Users/MOFENGTAO/Pictures/����/����άȨcopy.docx"));
		int key = 23;//��Կ
		int len;
		
		while((len=fis.read())!=-1){
			fos.write(len^key);
		}
		fis.close();
		fos.close();
	}

}
