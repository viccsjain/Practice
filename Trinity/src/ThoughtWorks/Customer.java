package ThoughtWorks;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {

	private String name;
	private Vector<Rental> _rentals = new Vector<>();

	public Customer(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void addRental(Rental arg) {
		_rentals.add(arg);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStatement() {
		double totalAmount = 0;
		int frequentPoints = 0;

		Enumeration<Rental> enumRentals = _rentals.elements();
		String result = "Statement for " + this.getName();
		while (enumRentals.hasMoreElements()) {

			Rental rental = enumRentals.nextElement();

			totalAmount += rental.getCharge();
			frequentPoints += rental.getFrequentPoints();
		}

		result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
		result += "You earned  " + String.valueOf(frequentPoints) + " frequent renter points\n";
		return result;
	}

}
