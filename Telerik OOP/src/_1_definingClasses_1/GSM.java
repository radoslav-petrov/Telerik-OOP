package _1_definingClasses_1;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class GSM {
	private String model;
	private String manufacturer;
	private double price;
	public String owner;
	
	public Battery battery = new Battery();
	public Display display = new Display();
	
	private static String iphone4S;

	// private ? ----------------------
	public List<Call> callsHistory = new ArrayList<Call>(); 
	
	public GSM(String model, String manufacturer) {
		this.model = model;
		this.manufacturer = manufacturer;
	}
	public GSM(String model, String manufacturer, double price) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
	}
	public GSM(String model, String manufacturer, double price, String owner, Battery battery, Display display) {
		this.model = model;
		this.manufacturer = manufacturer;
		this.price = price;
		this.owner = owner;
		this.battery = battery;
		this.display = display;
	}
	@Override public String toString() {
		String out;
		out = "Model: " + this.model + "\n";
		out += "Manufacturer: " + this.manufacturer + "\n";
		out += "Price: " + this.price + "\n";
		out += "Owner: " + this.owner + "\n";
		out += "Battery model: " + this.battery.batType + "\n";
		out += "Battery idle time: " + this.battery.hoursIdle + "\n";
		out += "Battery talk time: " + this.battery.hoursTalk + "\n";
		out += "Battery type: " + this.battery.batType + "\n";
		out += "Display resolution: " + this.display.sizeX + "x" + this.display.sizeY  + "px\n";
		out += "Display colors: " + this.display.numOfColors + "\n";
		return out;
	}
	public void setPrice(double newValue) {
		if(newValue > 0)
			this.price = newValue;
	}
	public double getPrice() {
		return this.price;
	}
	public static void setIphone4S(String data) {
		iphone4S = data;
	}
	public static String getIphone4S() {
		return iphone4S;
	}
	
	public void addCallToHistory(Date timeOfCall, int duration, String dialedNumber) {
		callsHistory.add(new Call(timeOfCall, duration, dialedNumber));
	}
	public void deleteCallFromHistory(int index) {
		callsHistory.remove(index);
	}
	public void clearCallHistory() {
		callsHistory.clear();
	}
	public double totalCallPrice(double pricePerMinute) {
		int totalDuration = 0;
		for(int i = 0; i < callsHistory.size(); i++) {
			 totalDuration += callsHistory.get(i).getDuration();
		}
		return totalDuration * pricePerMinute / 60;
	}
	public int getCallHistorySize() {
		return callsHistory.size();
	}
	public String getCallHistoryRecord(int index) {
		String line = null;
		line += "Call date: " + callsHistory.get(index).getCallDate() + "\n";
		line += "Call time: " + callsHistory.get(index).getCallTime() + "\n";
		line += "Number dialed: " + callsHistory.get(index).getDialedNumber() + "\n";
		line +=  "Call duration: " + callsHistory.get(index).getDuration() + "s\n";
		return line;
	}
	
}
