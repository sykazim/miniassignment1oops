package q2;
import java.util.logging.Logger;


public class DriverClient {
	
	private static final Logger logger = Logger.getLogger(DriverClient.class.getName());

	public static void main(String[] args) {
		

		Fraction a = new Fraction(0, 5);
		Fraction b = new Fraction(5, 0);
		Fraction c = new Fraction(0, 0);
		logger.info("result is " + a.divide());
		logger.info("result is " + b.divide());
		logger.info("result is " + c.divide());

	}

}
