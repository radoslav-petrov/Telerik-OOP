package _1_definingClasses_1;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class GSMCallHistoryTest {

	public static void main(String[] args) {
		Date callTime;
		Calendar calendar;
		GSM phone3 = new GSM("G2", "LG");
		
		calendar = new GregorianCalendar(2014, 8, 4, 12, 00, 00);
		callTime = calendar.getTime();
		phone3.addCallToHistory(callTime, 91, "0883456789");
		
		calendar = new GregorianCalendar(2010, 1, 2, 12, 45, 21);
		callTime = calendar.getTime();
		phone3.addCallToHistory(callTime, 6, "0883123456");
		
		calendar = new GregorianCalendar(2015, 1, 19, 20, 05, 03);
		callTime = calendar.getTime();
		phone3.addCallToHistory(callTime, 201, "0888888888");
		
		calendar = new GregorianCalendar(2008, 5, 25, 02, 33, 0);
		callTime = calendar.getTime();
		phone3.addCallToHistory(callTime, 91, "0891882374");
		
		for(int i = 0; i < phone3.getCallHistorySize(); i++) {
			System.out.println(phone3.getCallHistoryRecord(i));
		}
		
		System.out.printf("The total call price is %.2flv.%n",phone3.totalCallPrice(0.37));
		
		// GSM.callsHistory public because of this
		int maxDur = -1, maxDurIndex = -1;
		for(int i = 0; i < phone3.callsHistory.size(); i++) {
			if(maxDur < phone3.callsHistory.get(i).getDuration()) {
				maxDur = phone3.callsHistory.get(i).getDuration();
				maxDurIndex = i;
			}
		}
		phone3.deleteCallFromHistory(maxDurIndex);
		System.out.printf("The total call price is %.2flv.%n",phone3.totalCallPrice(0.37));
		
		phone3.clearCallHistory();
		for(int i = 0; i < phone3.getCallHistorySize(); i++) {
			System.out.println(phone3.getCallHistoryRecord(i));
		}
		
	}
}
