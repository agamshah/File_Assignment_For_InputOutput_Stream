package com.montran.main;


import java.io.File;
import java.util.Scanner;

import com.montran.util.FileInputStreamUtil1;
import com.montran.util.FileOutputStreamUtil2;
public class EmployeeMain {
	


		public static void main(String[] args) {
			
			// Writing data into file
			FileInputStreamUtil1 fileInputStreamUtil=new FileInputStreamUtil1();
			FileOutputStreamUtil2 fileOutputStreamUtil=new FileOutputStreamUtil2();
			Scanner scanner=new Scanner(System.in);
			int emp_id;
			double salary;
			String employee_name,filepath="C:/Users/AGAM/Documents/File/myfile.txt";
			byte[] data;
			File file=new File(filepath);
			
			System.out.print("Enter Employee ID: ");
			emp_id=scanner.nextInt();
			scanner.nextLine();
			System.out.print("Enter the Employee Name: ");
			employee_name=scanner.nextLine();
			System.out.print("Enter Employee Salary: ");
			salary=scanner.nextDouble();
			data=("Employee ID: "+emp_id+" Employee Name: "+employee_name+" Salary"+salary).getBytes();
			fileOutputStreamUtil.writeDataIntoFile(file, data);
			
			//reading data from file
			data=fileInputStreamUtil.getFilesData(file);
			for(byte byte1:data)
				System.out.print((char) byte1);
			scanner.close();
		}
	}
