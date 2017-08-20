package ThoughtWorks.price;

import ThoughtWorks.Movie;
import ThoughtWorks.Price;

public class Regular extends Price {

	@Override
	public double getPrice(int days) {
		double thisAmount = 2;
		if (days > 2) {
			thisAmount = (thisAmount - 2) * 1.5;
		}
		return thisAmount;
	}

	@Override
	public int getPriceCode() {
		return Movie.NEW_RELEASE;
	}
}
