package week3.day1;

public class Calculator {

	public void add(int a, int b, int c) {
		int sum = a + b + c;
		System.out.println(sum);
	}

	public void add(int a, int b) {
		int sum = a + b;
		System.out.println(sum);
	}

	public void multiply(int d, int e) {
		int multiply = d * e;
		System.out.println(multiply);
	}

	public void multiply(int f, double g) {
		int multiply = f;
		System.out.println(multiply);
	}

	public void sub(int m, int n) {
		int sub = m - n;
		System.out.println(sub);
	}

	public void sub(double m, double n) {
		double sub = m - n;
		System.out.println(sub);
	}

	public void div(int m, int n) {
		int sub = m / n;
		System.out.println(sub);
	}

	public void div(double m, double n) {
		double sub = m / n;
		System.out.println(sub);
	}
	public static void main(String[] args) {
		Calculator obj=new Calculator();
		obj.add(5,5);	
		obj.add(5,2,5);
		obj.multiply(2,3);
		obj.multiply(3,678);
		obj.sub(10,4);
		obj.sub(1000,888);
		obj.div(200,40000);
		obj.div(5,60);
	}
	

}
