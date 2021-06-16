/**
 * The main part of the calculator doing the calculations.
 * 
 * @author n-c0de-r, jonasblome, and joeysmeets
 * @version 12.06.21
 */

public class CalcEngineString {
	private String displayString = "";
	private Postfix postfix;

	public CalcEngineString() {
		postfix = new Postfix();
	}

	/**
	 * @return The string that should be calculated by postfix.
	 */
	public String getDisplayString() {
		return displayString;
	}

	/**
	 * Extend the string to evaluate
	 * 
	 * @param number The number pressed on the calculator.
	 */
	public void buttonPressed(String number) {
		displayString = displayString + number;
		displayString += " ";
	}

	/**
	 * Calculate the dec / hex output
	 * 
	 * @param mode The base mode to parse to.
	 */
	public void equals(int mode) {
		if (displayString != null) {
			String pfx = postfix.infixToPostfix(displayString);
			if (mode == 10) {
				displayString = "" + postfix.evaluate(pfx);
			} else {
				// Cast Doubles to integer, as hex can't calculate doubles anyways!
				displayString = "" + Integer.toHexString((int) (postfix.evaluate(pfx)));
			}
		}
	}

	/**
	 * The 'C' (clear) button was pressed. Reset everything to a starting state.
	 */
	public void clear() {
		displayString = "";
	}

	/**
	 * @return The title of this calculation engine.
	 */
	public String getTitle() {
		return "Better Java Calculator";
	}

	/**
	 * @return The author of this engine.
	 */
	public String getAuthor() {
		return "D.J. Barnes & M. Kolling";
	}

	/**
	 * @return The version number of this engine.
	 */
	public String getVersion() {
		return "Version 2";
	}
}
