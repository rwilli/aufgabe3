/**
 * 
 */

/**
 * @author Gruppe222
 *
 */
public class Fraction {
	public long num;
	public long denom;
	
	public Fraction(long num, long denom) throws InvalidValueException {
		if (denom == 0) throw new InvalidValueException(denom);
		this.num = num;
		this.denom = denom;
	}
	
	public Fraction returnComplement() throws InvalidValueException {
		return new Fraction(denom-num, denom);
	}
	
	public Fraction divideNumberByFraction(int number, Fraction f) throws InvalidValueException {
		return new Fraction (number * denom, num);	
	}
	
	public boolean fractionIsInteger() {
		if (num % denom == 0) return true;
		return false;
	}
	
	public String toString() {
		return num + " " + denom;
	}
}
