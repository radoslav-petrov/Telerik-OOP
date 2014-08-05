package _1_definingClasses_1;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class Call {
	
	private DateFormat timeFormatter;
	private DateFormat dateFormatter;
	private String callTime;
	private String callDate;
	private int duration;
	private String dialedNumber;
	
	public void setCallTime(Date timeOfCall) {
		Locale currentLocale = new Locale("en");
		timeFormatter = DateFormat.getTimeInstance(DateFormat.DEFAULT, currentLocale);
		dateFormatter = DateFormat.getDateInstance(DateFormat.DEFAULT, currentLocale);
		
		this.callTime = timeFormatter.format(timeOfCall);
		this.callDate = dateFormatter.format(timeOfCall);
	}
	public String getCallTime() {
		return this.callTime;
	}
	public String getCallDate() {
		return this.callDate;
	}
	
	public Call(Date timeOfCall, int duration, String dialedNumber) {
		setCallTime(timeOfCall);
		this.duration = duration;
		this.dialedNumber = dialedNumber;
	}
	public int getDuration() {
		return this.duration;
	}
	public String getDialedNumber() {
		return this.dialedNumber;
	}
	
}
