import java.net.*;
import java.io.*;
public class Exam_02 {
	
	public static void main(String[] args) {
		ServerSocket ss = null;
		for(int i=0; i<65536;i++) {
			try {
				ss=new ServerSocket(i);
				ss.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println(i+"번은 이미 사용중 입니다.");
			}
		}
	}
	
}
