package dev.spring.core;

/**
 * Main Bean Class. This Bean class require implementation of prepareTea() by
 * some other class. In this project, implementation of prepareTea() is given by
 * Tea Class.
 * 
 * @author gauraw
 *
 */
public class Resturant {
	IHotDrink hotDrink;

	public Resturant() {

	}

	// constructor way to set object
	public Resturant(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}

	// setter way to set object
	public void setHotDrink(IHotDrink hotDrink) {
		this.hotDrink = hotDrink;
	}

	public void prepareHotDrink() {
		hotDrink.prepareTea();
	}
}
