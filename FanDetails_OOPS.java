import java.util.Scanner;
class Fan
{
	final int SLOW=1,MEDIUM=2,FAST=3;
	int speed;
	boolean f_on;
	double radius;
	String color;
	void setDefault()
	{
		speed=1;
		f_on=false;
		radius=4;
		color="Blue";
	}
	void setUserDefined(int s,boolean f,double r,String c)
	{
		speed=s;
		f_on=f;
		radius=r;
		color=c;
	}
	void Display()
	{
		if(f_on==true)//Userdefined Fan details
		{
			System.out.println("Speed: "+speed);
			System.out.println("Radius: "+radius);
			System.out.println("Colour: "+color);
		}
		else
		{
			System.out.println("Fan is off");
			System.out.println("Radius: "+radius);
			System.out.println("Colour: "+color);
		}
	}
}
class Main
{
	public static void main(String[] args)
	{
		Fan f1=new Fan();
		Fan f2=new Fan();
		f1.setDefault();
		f2.setUserDefined(2,true,6,"Brown");
		System.out.println("Default Fan details:-");
		f1.Display();
		System.out.println("Userdefined Fan details:-");
		f2.Display();
	}
}