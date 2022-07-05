package jarTask;

import java.sql.SQLException;
import java.util.Scanner;

import jartask.CreateEmployee;
import jartask.DeleteEmployee;
import jartask.ListEmployee;
import jartask.ModifyEmployee;
public class Task6 {
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		 Scanner sc=new Scanner(System.in);
		System.out.println("Enter the EmployeeType:Permanent, PartTime, Contract");
    	String EmpType=sc.nextLine();
    	System.out.println("Select the Function:Create, Modify,Delete, List");
    	String fun= sc.nextLine();
    	if("Create".equalsIgnoreCase(fun)) {
    	CreateEmployee.create(EmpType);}
    	else if("Modify".equalsIgnoreCase(fun)) {
    	ModifyEmployee.modify(EmpType);}
    	else if("Delete".equalsIgnoreCase(fun)) {
    	DeleteEmployee.delete(EmpType);}
    	else if("List".equalsIgnoreCase(fun)) {
    	ListEmployee.list();
    	}else {
    		 System.out.println("enter the correct function");
    	}
    	
    	
}}
