package edu.rice.kwl2.drinktracker;

import java.util.ArrayList;

public class Person extends APerson {
	
	private String name;
	private double weight;
	private Height height;
	private String gender;
	private ArrayList<IEvent> events = new ArrayList<IEvent>();
	
	/**
	 * Create a personal profile when user first opens app.
	 */
	public Person(String name, double weight, Height height, String gender) {
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.gender = gender;
		addEvent( new Event(this) );
	}
	
	/**
	 * Adds an event into the person's history.
	 */
	public void addEvent(IEvent newEvent) {
		events.add(newEvent);
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public Height getHeight() {
		return height;
	}

	public void setHeight(Height height) {
		this.height = height;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	public double getBodyWaterConstant () {
		if (gender == "Female") {
			return .49;
		} else {
			return .58;
		}
	}
	
	public double getMetabolism () {
		if (gender == "Female") {
			return .017;
		} else {
			return .015;
		}
	}
	
	public IEvent getCurrentEvent() {
		return events.get(events.size() -1);
	}

	@Override
	public void setHeight(int feet, int inches) {
		// TODO Auto-generated method stub
		
	}

	//@Override
	//public void setGender() {
		// TODO Auto-generated method stub
		
	//}
	
}
