package week1.day2.assignments;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc=new Calculator();
		int add = calc.add(2, 5, 6);
		int sub = calc.sub(34, 15);
		double mul = calc.mul(455.33d, 4555.6d);
		float div = calc.div(10.5f, 2.5f);
		
      System.out.println("add "+add);
      System.out.println("sub "+sub);
      System.out.println("mul "+mul);
      System.out.println("div "+div);
	}

}
