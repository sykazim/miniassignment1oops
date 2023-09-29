package q2;

public class Fraction {

	private double numerator;
	private double denominator;

	public Fraction(double numerator, double denominator) {
		super();
		this.numerator = numerator;
		this.denominator = denominator;
	}

	public double divide() {
		return this.numerator / this.denominator;
	}
}
