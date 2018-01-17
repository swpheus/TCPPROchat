import java.net.*;
import java.io.*;
public class Exam_03 {
	public static void main(String[] args) {
		//TCP 클라이언트 컴퓨터
		ServerSocket ss=null;
		Socket soc=null;
		try {
			ss=new ServerSocket(12345);
			System.out.println("서버 대기중 ...");
			soc=ss.accept();
			String msg ="자바 네트워크 프로그램 입니다";
			PrintWriter pw = new PrintWriter(new BufferedWriter
					(new OutputStreamWriter(soc.getOutputStream())));
			pw.println(msg+"\n");
			pw.flush();
			BufferedReader br = new BufferedReader
					(new InputStreamReader(soc.getInputStream()));
			System.out.println("서버에서 전송된 내용 :"+br.readLine());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
