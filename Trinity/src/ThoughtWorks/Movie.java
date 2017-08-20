package ThoughtWorks;

import ThoughtWorks.price.ChildrenMovie;
import ThoughtWorks.price.NewRelease;
import ThoughtWorks.price.Regular;

public class Movie {

	String title;
	Price price;

	public static final int REGULAR = 0;
	public static final int CHILDREN = 1;
	public static final int NEW_RELEASE = 2;

	public Movie(String title, int priceCode) {
		super();
		this.title = title;
		setPriceCode(priceCode);
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPriceCode() {
		return price.getPriceCode();
	}

	public void setPriceCode(int priceCode) {
		switch (priceCode) {
		case Movie.CHILDREN:
			price = new ChildrenMovie();
			break;
		case Movie.REGULAR:
			price = new Regular();
			break;
		case Movie.NEW_RELEASE:
			price = new NewRelease();
			break;
		default:
			throw new IllegalArgumentException();
		}

	}

	double getCharge(int days) {
		return price.getPrice(days);
	}

	public int getFrequentPoints(int days) {
		return price.getFrequentPoints(days);
	}

}
