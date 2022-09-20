package com.demo.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.demo.beans.Employee;

public class EmployeeDaoMapImpl implements EmployeeDao {
	static Map<Integer,Employee> employeeMap=new HashMap<>();
	static{
		Employee employee1=new Employee(11,"Anupam","pune",new Date(2012,04,05));
		Employee employee2=new Employee(12,"alok","bihar",new Date(2000,12,21));
		Employee employee3=new Employee(13,"ayushh","patna",new Date(2011,11,5));
		employeeMap.put(11,employee1);
		employeeMap.put(12,employee2);
		employeeMap.put(13,employee3);
		
		
	}
	public ArrayList<Employee> getEmployeeDetails()
	{
		ArrayList<Employee> arr=(ArrayList<Employee>)employeeMap.values();
		return arr;
	}
	public void writeToFile()
	{
		File f=new File("employeeMap.dat");
		if(f.exists())
		{
			try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("employee.dat"));)
			{
				Set<Employee> s=(Set<Employee>) employeeMap.values();
				for(Employee s1:s)
				{
					out.writeObject(s);
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
