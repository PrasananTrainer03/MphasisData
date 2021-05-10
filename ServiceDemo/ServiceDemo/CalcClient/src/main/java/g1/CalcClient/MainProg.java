package g1.CalcClient;

import java.rmi.RemoteException;
import java.util.Scanner;

import javax.xml.rpc.ServiceException;

import g1.ServiceDemo.Calc;
import g1.ServiceDemo.CalcService;
import g1.ServiceDemo.CalcServiceLocator;

public class MainProg {

	public static void main(String[] args) {
		int a,b,c;
		System.out.println("Enter 2 Nos  ");
		Scanner sc = new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		CalcServiceLocator loc = new CalcServiceLocator();
		try {
			Calc proxy = loc.getCalc();
			c = proxy.sum(a, b);
			System.out.println("Sum is  " +c);
		} catch (ServiceException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
