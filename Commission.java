package program;

import java.util.Scanner;

public class Commission 
{

	public static void main(String[] args)
	{
		int sale;
		float commission;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the sales amount");
		sale=s.nextInt();
		if (sale<=1000)
			commission=0;
		else if (sale>=1001 && sale<=3000)
			commission=sale*3/100;
		else if (sale>=3001 && sale<=6000)
			commission=sale*5/100;
		else if (sale>=6001 && sale <=9000)
			commission=sale*7/100;
		else
			commission=sale*9/100;
		System.out.println("the commission is"+commission);
		
	}

}
