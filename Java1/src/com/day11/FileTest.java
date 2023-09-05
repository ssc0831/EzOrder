package com.day11;

import java.io.File;
import java.io.IOException;
// p.557
public class FileTest {

	public static void main(String[] args) throws IOException {
		File file = new File("src\\com\\day11\\FileTest.txt");
		file.createNewFile();
		System.out.println(file.isFile()); // 파일인가?
		System.out.println(file.isDirectory()); // 디렉토리인가?
		System.out.println(file.getName()); // 파일의 이름
		System.out.println(file.getAbsolutePath()); // 파일의 절대경로
		System.out.println(file.getPath()); // 파일의 경로
		System.out.println(file.canRead()); // 읽을 수 있는가?
		System.out.println(file.canWrite()); // 쓸수 있는가?
		System.out.println(file.delete()); // 파일 삭제
	}

}
