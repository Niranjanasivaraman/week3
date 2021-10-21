package week3.day1;

public class MethodOverloading {
	
		public void employeeInfo(){
			String Name="siva";
			System.out.println("Name:" + Name);
		}
	
	
		public void employeeInfo(String name,int empID){
			System.out.println("Name:" + name);
			System.out.println("ID:" + empID);
		}

		public void employeeInfo(String name, int empID,int age){
			System.out.println("Name:"+name);
			System.out.println("Id:"+empID);
			System.out.println("Age"+age );
		}

		public void employeeInfo(int empId,int age){
			System.out.println("Id:"+empId);
			System.out.println("Age"+age );	
		}
		
		public void employeeInfo(int empId,int age,String sex){
			System.out.println("Id:"+empId);
			System.out.println("Age"+age );	
			System.out.println("Name:"+ sex);	
			
		}
		public static void main(String[] args) {
			MethodOverloading obj = new MethodOverloading();
			obj.employeeInfo();
			obj.employeeInfo(171, 24);
			obj.employeeInfo("siva", 172);
			obj.employeeInfo("balaji", 173, 27);
     		obj.employeeInfo(173,26,"kripa");
		
	
		}
			
}	

