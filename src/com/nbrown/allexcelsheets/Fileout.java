package com.nbrown.allexcelsheets;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Fileout {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("sai.text");
		String str="Saikiran talanki";
		byte[] b=str.getBytes();
		fos.write(b);
	}

}
