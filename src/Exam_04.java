import java.net.*;
import java.io.*;
public class Exam_04 {
	public static void main(String[] args) {
		InetAddress ia =null;
		Socket soc =null;
		
		try {
			ia=InetAddress.getByName("localhost");
			try {
				BufferedReader br = new BufferedReader
						(new InputStreamReader(soc.getInputStream()));
				System.out.println("전송된 내용 :"+br.readLine());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			try {
				soc = new Socket(ia,12345);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("시스템끝");
	}
}
