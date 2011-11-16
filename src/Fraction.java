/**
 * Fraction class represents a rational number.
 * 
 * @author Gruppe222
 */
public class Fraction {
	public long num;
	public long denom;

	/**
	 * Constructor for a fraction
	 * 
	 * @param num
	 *            the value above the faction line.
	 * @param denom
	 *            the value below the fraction line
	 *            denom must be greater than zero.
	 * @throws InvalidValueException
	 *             is thrown if the denominator is 0
	 */
	public Fraction(long num, long denom) throws InvalidValueException {
		if (denom == 0)
			throw new InvalidValueException(denom);
		this.num = num;
		this.denom = denom;
	}

	/**
	 * Returns the complement of the current fraction
	 * l
	 * @return the complement of a fraction
	 * @throws InvalidValueException
	 *             is thrown if the denomiator is 0
	 */
	public Fraction returnComplement() throws InvalidValueException {
		return new Fraction(denom - num, denom);
	}

	/**
	 * Divides a given number by the fraction f.
	 * 
	 * @param number
	 *            dividend
	 * @param f
	 *            divisor
	 * @return
	 * @throws InvalidValueException
	 *             is thrown if the denominator is 0
	 */
	public Fraction divideNumberByFraction(int number, Fraction f)
			throws InvalidValueException {
		return new Fraction(number * denom, num);
	}

	/**
	 * Determines whether the current fraction is an integer.
	 * 
	 * @return true or false
	 */
	public boolean fractionIsInteger() {
		if (num % denom == 0)
			return true;
		return false;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return num + "/" + denom;
	}
}
