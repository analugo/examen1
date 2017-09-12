
public class ChudnovskyCalc implements ChudnovskyI {

	
	private int c1 = 0;
	private int c2 = 0;
	private double Chud;
	private double fact = 1;
	

	public double AlgC (double num)
	{
		if(c2 <= num) 
		{
			this.c2++;
			this.Chud = (Math.pow(-1, c1)* Factorial (c2*6));
			AlgC(num);
			return this.Chud;
		}
		return num;
		
	}

	@Override
	public double Fac(double number) {
		if(this.c1 <= number) {
			fact = fact * c1;
			this.c1++;
			Factorial(number);
		}
		
		return fact;
	}

	@Override
	public double AlgChudnovsky(double number) {
		if(c2 <= number) 
		{
			this.c2++;
			this.Chud = (Math.pow(-1, c1)* (Factorial(c2*6)));
			AlgC(number);
			return this.Chud;
		}
		return number;
	}

	private double Factorial(double number) {
		
		return 0;
	}
	
	
}

