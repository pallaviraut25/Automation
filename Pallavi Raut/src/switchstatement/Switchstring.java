package switchstatement;

public class Switchstring {

	public static void main(String[] args) {
		// month Number on the basis of month Name

		String monthName = "apr";
		switch (monthName) {

		case "jan":
			System.out.println("1");
			break;
		case "feb":
			System.out.println("2");
			break;
		case "mar":
			System.out.println("3");
			break;
		case "apr":
			System.out.println("4");
			break;
		case "may":
			System.out.println("5");
			break;
		case "jun":
			System.out.println("6");
			break;
		case "july":
			System.out.println("7");
			break;
		case "aug":
			System.out.println("8");
			break;
		case "sep":
			System.out.println("9");
			break;
		case "oct":
			System.out.println("10");
			break;
		case "nov":
			System.out.println("11");
			break;
		case "dec":
			System.out.println("12");
			break;

		default:
			System.out.println("invalid month");
			break;

		}

		// Print Week number on the basis of Week name---Home Work

		String a = "Mon";

		switch (a) {

		case "Mon":
			System.out.println("1");
			break;

		case "Tue":
			System.out.println("1");
			break;

		case "Wed":
			System.out.println("1");
			break;

		case "Thu":
			System.out.println("1");
			break;

		case "Fri":
			System.out.println("1");
			break;

		case "Sat":
			System.out.println("1");
			break;

		case "Sun":
			System.out.println("1");
			break;

		default:
			System.out.println("Invalid week");
			break;

		}

	}

}
