package entities;

public class reservations {

	private String reservedAp;
	private String date;
	private int nightsIn;
	private int fullPrice;
	private String resMsg;
	private String guest;
	private enum status
	{
		CREATED,
		REFUSED,
		DECLINE,
		ACCEPTED,
		FINISHED
	}
}
