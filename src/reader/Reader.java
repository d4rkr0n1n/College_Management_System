package reader;

import java.io.*;    

public class Reader {
	public void read() {
		String line = "";  
		String splitBy = ","; 
		try {
			String location = "C:\\Users\\Mridul Roy\\eclipse-workspace-dev\\College_Management_System\\src\\data\\";
			BufferedReader br = new BufferedReader(new FileReader(location + "file.csv"));  
			while ((line = br.readLine()) != null) {
				String[] employee = line.split(splitBy);    // use comma as separator  
				System.out.println("Employee [First Name=" + employee[0] + ", Last Name=" + employee[1] + ", Designation=" + employee[2] + ", Contact=" + employee[3] + ", Salary= " + employee[4] + ", City= " + employee[5] +"]"); 
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 

}
