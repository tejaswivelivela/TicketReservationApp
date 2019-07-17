package bus.reservation.system;

public class TicketCounter {

	private int unoccupiedSeats = 3;

	public synchronized void bookTicket(String pname, int numberOfSeats) {
		if ((unoccupiedSeats >= numberOfSeats) && (numberOfSeats > 0)) {
			System.out.println("Hi," + pname + " : " + numberOfSeats+ " Seats booked Successfully..");
			unoccupiedSeats = unoccupiedSeats- numberOfSeats;
		} else
			System.out.println("Hi," + pname + " : Seats Not Available");
	}
}