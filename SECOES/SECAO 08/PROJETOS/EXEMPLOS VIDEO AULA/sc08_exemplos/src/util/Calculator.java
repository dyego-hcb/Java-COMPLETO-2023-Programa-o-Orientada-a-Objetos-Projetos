package util;

public class Calculator {
	public final double PI = 3.14159;
	
	public double circumference(double radius)
	{
		return 2.0 * PI * radius;
	}
	public double volume(double radius)
	{
		return 4.0 * PI * radius * radius * radius / 3.0;
	}
	
	public final static double PI_STATIC = 3.14159;
	
	public static double circumferenceStatic(double radius)
	{
		return 2.0 * PI_STATIC * radius;
	}
	public static double volumeStatic(double radius)
	{
		return 4.0 * PI_STATIC * radius * radius * radius / 3.0;
	}
}
