import java.net.*;
import java.io.*;
public class Exam_03 {
	public static void main(String[] args) {
		//TCP Ŭ���̾�Ʈ ��ǻ��
		ServerSocket ss=null;
		Socket soc=null;
		try {
			ss=new ServerSocket(12345);
			System.out.println("���� ����� ...");
			soc=ss.accept();
			String msg ="�ڹ� ��Ʈ��ũ ���α׷� �Դϴ�";
			PrintWriter pw = new PrintWriter(new BufferedWriter
					(new OutputStreamWriter(soc.getOutputStream())));
			pw.println(msg+"\n");
			pw.flush();
			BufferedReader br = new BufferedReader
					(new InputStreamReader(soc.getInputStream()));
			System.out.println("�������� ���۵� ���� :"+br.readLine());
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
