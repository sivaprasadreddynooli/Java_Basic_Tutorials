package ApprovedCernerAnswers;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.*;

public class NurseNotification {
	private String medicineName;
	private Date startDate;
	private Date endDate;
	private Frequency frequency;
	private int adhocTime;

	public int getAdhocTime() {
		return adhocTime;
	}

	public void setAdhocTime(int adhocTime) {
		this.adhocTime = adhocTime;
	}

	public String getMedicineName() {
		return medicineName;
	}

	public void setMedicineName(String medicineName) {
		this.medicineName = medicineName;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Frequency getFrequency() {
		return frequency;
	}

	public void setFrequency(Frequency frequency) {
		this.frequency = frequency;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		NurseNotification notification = new NurseNotification();
		notification.setMedicineName("Crocin");
		LocalDateTime ldt = LocalDateTime.ofInstant(Instant.now(),
				ZoneId.systemDefault());
		notification.setStartDate((Date.from(ldt.atZone(ZoneId.systemDefault())
				.toInstant())));
		System.out
				.println("Enter how many days you want to take this medicine");
		notification.setEndDate((Date.from(ldt.plusDays(scan.nextInt())
				.atZone(ZoneId.systemDefault()).toInstant())));
		notification.setFrequency(Frequency.CUSTOM);
		if (notification.getFrequency() == Frequency.CUSTOM) {
			System.out.println("Enter medicine frequency in hours");
			notification.setAdhocTime(scan.nextInt());
		}

		System.out.println();
		ArrayList<Date> result = notification.notifier();
		for (Date date : result) {
			System.out.println(date);
		}

	}

	public ArrayList<Date> notifier() {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(startDate);
		ArrayList<Date> al = new ArrayList<Date>();
		Frequency freq = frequency;
		if (freq == Frequency.ONETIME) {
			System.out.println("Take your medicine now");
			startDate = getEndDate();
		}

		while (startDate.getTime() < endDate.getTime()) {

			switch (freq) {
			case HOURLY:
				calendar.add(Calendar.HOUR_OF_DAY, 1);
				startDate = calendar.getTime();
				al.add(startDate);
				break;
			case DAILY:
				calendar.add(Calendar.DAY_OF_MONTH, 1);
				startDate = calendar.getTime();
				al.add(startDate);
				break;
			case WEEKLY:
				calendar.add(Calendar.WEEK_OF_MONTH, 1);
				startDate = calendar.getTime();
				al.add(startDate);
				break;
			case MONTHLY:
				calendar.add(Calendar.MONTH, 1);
				startDate = calendar.getTime();
				al.add(startDate);
				break;

			case YEARLY:
				calendar.add(Calendar.YEAR, 1);
				startDate = calendar.getTime();
				al.add(startDate);
				break;
			case CUSTOM:
				calendar.add(Calendar.HOUR_OF_DAY, getAdhocTime());
				startDate = calendar.getTime();
				al.add(startDate);
				break;
			default:
				break;

			}

		}
		return al;
	}

}

enum Frequency {
	ONETIME, HOURLY, DAILY, WEEKLY, MONTHLY, YEARLY, CUSTOM
}
