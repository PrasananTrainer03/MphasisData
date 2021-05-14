package org.hib.rest.mphasis;

public class MainEmploySearch {

	public static void main(String[] args) {
		int empno=1;
		Employ e = new EmployDao().search(empno);
		if (e!=null) {
			System.out.println(e.getEmpno() + "  " + e.getName() + "  " +e.getDept() + "  "
					+ e.getDesig() + "  " + e.getGender() + "  " +e.getBasic());
		}
	}
}
