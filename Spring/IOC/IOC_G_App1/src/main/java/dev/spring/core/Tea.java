package dev.spring.core;

/**
 * Implementation provider class of prepareTea()
 * 
 * @author gauraw
 *
 */
public class Tea implements IHotDrink {

	@Override
	public void prepareTea() {
		System.out.println("Preparing tea for you.....");
	}

}
