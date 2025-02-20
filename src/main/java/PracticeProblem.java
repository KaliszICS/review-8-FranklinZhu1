public class PracticeProblem {

	public static String pluralize(String word) {
		/*
		switch(word.length()) {
			case 0:
				return "s";
			case 1:
				if (word.equals("y")) return "ies";
				else return "s";
			case 2:
				if (word.equals("ey")) return "eys";
				else if (word.charAt(1) == 'y') return "ies";
				else return "s";
			default: // technically redundant default statement
				if (word.substring(word.length() - 2).equalsIgnoreCase("ey")) return "eys";
				else if (word.substring(word.length() - 1).equalsIgnoreCase("y")) return "ies";
				else if (word.substring(word.length() - 3).equalsIgnoreCase("ife")) return "ives";
				else return "s";
		}
		*/

		// ^^^ forgot .endswith() is a thing

		word = word.toLowerCase();
		if (word.endsWith("ey")) return "eys";
		else if (word.endsWith("y")) return "ies";
		else if (word.endsWith("ife")) return "ives";
		else return "s";
	}

	public static int min(int num1, int num2, int num3) {
		return Math.min(Math.min(num1, num2), num3);
	}

	public static boolean isLeapYear(int num1) {
		if (num1%4 == 0) {
			if (num1%100 == 0) {
				if (num1%400 == 0) {
					return true;
				}
				else return false;
			}
			else return true;
		}
		else return false;
	}

}
