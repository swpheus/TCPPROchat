import java.net.*;

public class Exam_01 {
	public static void main(String[] args) {
		 InetAddress ia = null;
		 
		 try {
			ia=InetAddress.getByName("www.naver.com");
			System.out.println("�������ּ� :"+ia.getHostAddress());
			System.out.println("ȣ��Ʈ�̸� :"+ia.getHostName());
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
