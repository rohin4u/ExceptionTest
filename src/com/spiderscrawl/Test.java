package com.spiderscrawl;

import java.io.File;
import java.io.FileNotFoundException;

public class Test {
	
	
	public static void main(String[] args) throws Exception{
		
		
		File file  = new File("abc.txt");
		
		throw new FileNotFoundException("Hey! File is Deleted By some Cause");

	}

}
