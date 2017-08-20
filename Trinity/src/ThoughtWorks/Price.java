package ThoughtWorks;

public abstract class Price {

	public abstract double getPrice(int days);

	public int getFrequentPoints(int days) {
		return 1;
	}

	public abstract int getPriceCode();
}
