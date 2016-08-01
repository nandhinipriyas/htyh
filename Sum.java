package activity;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int num;
		int sum=0;
		int a;
		int sum1=0;
		Scanner in=new Scanner(System.in);
		num=in.nextInt();
		while(num!=0)
		{
			sum=sum+(num%10);
			num=num/10;
			if(num>0)
			{
				a=num;
			while(a!=0)
			{
				sum1=sum1+(a%10);
				a=a/10;
			}
			}
		}
		System.out.println(sum+sum1);
	}

}
