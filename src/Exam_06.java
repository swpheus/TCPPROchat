import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Exam_06 extends Thread{
	InetAddress ia=null;
	Socket soc =null;
	PrintWriter pw =null;
	BufferedReader br =null;
	Scanner sc =null;
	public Exam_06() {
		// TODO Auto-generated constructor stub
		try {
			ia= InetAddress.getByName("localhost");
			soc= new Socket(ia, 12345);
			this.start();
			sc= new Scanner(System.in);
			pw= new PrintWriter(new BufferedWriter
					(new OutputStreamWriter(soc.getOutputStream())));
			while (true) {
			    System.out.println("서버에 할 말 :");
			    String msg =sc.next();
			    pw.println(msg);
			    pw.flush();
			}

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
				
	}
	public void run() {
		// TODO Auto-generated method stub
		try {
			br= new BufferedReader(new InputStreamReader(soc.getInputStream()));
			while(true) {
				String msg =br.readLine();
				System.out.println("서버 에서 온 말 :"+msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		//server
		new Exam_06();
	}
}