package dxc.LeaveManagementProject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ClientProg {
	public static void main(String[] args) {
//		int a, b;
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter 2 Nos  ");
//		a = sc.nextInt();
//		b = sc.nextInt();
		 try {

				//	URL url = new URL("http://localhost:8080/RestHelloDemo/webapi/test");
				//	URL url = new URL("http://localhost:8080/RestHelloDemo/webapi/test/sum/12/5");
				//	  String cmd = "http://localhost:8080/RestHelloWorld/webapi/calcservice/sum/" +a+"/"+b;
					  String cmd = "http://localhost:8080/LeaveManagementProject/webapi/employee/";
					URL url = new URL(cmd);
					HttpURLConnection conn = (HttpURLConnection) url.openConnection();
					conn.setRequestMethod("GET");
					conn.setRequestProperty("Accept", "application/json");

					if (conn.getResponseCode() != 200) {
						throw new RuntimeException("Failed : HTTP error code : "
								+ conn.getResponseCode());
					}

					BufferedReader br = new BufferedReader(new InputStreamReader(
						(conn.getInputStream())));

					String output;
					System.out.println("Output from Server .... \n");
					while ((output = br.readLine()) != null) {
						System.out.println(output);
					}

					conn.disconnect();

				  } catch (MalformedURLException e) {

					e.printStackTrace();

				  } catch (IOException e) {

					e.printStackTrace();

				  }

	}
}
