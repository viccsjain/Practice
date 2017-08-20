package ThoughtWorks.price;

import ThoughtWorks.Movie;
import ThoughtWorks.Price;

public class NewRelease extends Price {
	
	String name;

	public double getPrice(int days) {
		return days * 3;
	}

	public int getFrequentPoints(int days) {
		if (days > 2)
			return 2;
		return 1;
	}

	@Override
	public int getPriceCode() {
		// TODO Auto-generated method stub
		return Movie.NEW_RELEASE;
	}

}
