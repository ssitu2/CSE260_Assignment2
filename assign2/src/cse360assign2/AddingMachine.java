package cse360assign2;

/**
 * @author Steven
 * Class that stores a value as total
 * Stores the history of operations as a string
 * And can perform add and subtract to that value
 */
public class AddingMachine {

	private int total;
	private String history;
	
	/**
	 * Creates a class that can do math functions to a stored value
	 * String history contains string of all functions performed
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}
	
	/**
	 * Returns the total
	 * 
	 * @return int total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds int value to the current total and stores new value in total
	 * 
	 * @param value int
	 */
	public void add (int value) {
		total = value + total;
		history = history + " + " + value;
	}
	
	/**
	 * Subtracts value from total and sets total result as total
	 * 
	 * @param value
	 */
	public void subtract (int value) {
		total = value - total;
		history = history + " - " + value;
	}
		
	/**
	 * Functions returns operations history as a string
	 * 
	 * @return history of operations as a string
	 */
	public String toString () {
		return history;
	}

	/**
	 * Resets the history to "0"
	 */
	public void clear() {
		history = "0";
	}
}
