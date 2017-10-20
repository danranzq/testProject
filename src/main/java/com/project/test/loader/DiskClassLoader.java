package com.project.test.loader;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class DiskClassLoader extends ClassLoader{
	private String mLib;
	public DiskClassLoader(String path) {
		mLib = path;
	}
	@Override
	protected Class<?> findClass (String name) throws ClassNotFoundException{
		String filename = getFileName(name);
		File file = new File(mLib,filename);
		try {
		FileInputStream in = new FileInputStream(file);
		ByteArrayOutputStream barr = new ByteArrayOutputStream();
		int len = 0;
			try{
				while((len = in.read()) != -1){
					barr.write(len);
				}
			}catch (IOException e){
				e.printStackTrace();
			}
			  byte[] data = barr.toByteArray();
	            in.close();
	            barr.close();
	            return defineClass(name, data, 0, data.length);
		} catch (Exception e){
			e.printStackTrace();
		}
		 return super.findClass(name);
	}
	private String getFileName(String name){
		int index = name.lastIndexOf(".");
		if(index == -1){
			return name+".class";
		} else {
			return name.substring(index)+".class";
		}
	}
}
