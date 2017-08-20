package ThoughtWorks.price;

import ThoughtWorks.Movie;
import ThoughtWorks.Price;

public class ChildrenMovie extends Price{

	public double getPrice(int days) {
		double thisAmount = 1.5;
		if (days > 3) {
			thisAmount += (thisAmount - 3) * 1.5;
		}
		return thisAmount;
	}
	
	@Override
	public int getPriceCode() {
		return Movie.CHILDREN;
	}

}
