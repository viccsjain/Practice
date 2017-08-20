package ThoughtWorks;

public class Rental {

	private Movie _movie;
	private int Days;

	public Rental(Movie _movie, int days) {
		super();
		this._movie = _movie;
		Days = days;
	}

	public Movie get_movie() {
		return _movie;
	}

	public void set_movie(Movie _movie) {
		this._movie = _movie;
	}

	public int getDays() {
		return Days;
	}

	public void setDays(int days) {
		Days = days;
	}

	double getCharge() {
		return get_movie().getCharge(getDays());
	}

	public int getFrequentPoints() {
		return get_movie().getFrequentPoints(getDays());
	}

}
