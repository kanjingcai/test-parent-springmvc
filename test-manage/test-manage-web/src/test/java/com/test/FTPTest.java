package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.SocketException;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.junit.Test;

public class FTPTest {

	@Test
	public void testClient() throws SocketException, IOException {
		FTPClient ftpClient = new FTPClient();
		ftpClient.connect("192.168.24.130");
		ftpClient.login("ftpuser", "ftpuser");
		
		
		FileInputStream fis = new FileInputStream(new File("E:\\hello.jpg"));
		ftpClient.changeWorkingDirectory("/home/ftpuser/www/image");
		ftpClient.setFileType(FTP.BINARY_FILE_TYPE);
		ftpClient.storeFile("hello.jpg", fis);
		ftpClient.logout();//123456789
	}
}
