package util;

public class CurrencyConverter {
	public static final double IOF = 0.06;
	
	public static double valueTotal(double valueDolar, double valueChange)
	{
		double valueConvert = valueDolar * valueChange;
		return valueConvert * (1 + IOF);
	}
}
