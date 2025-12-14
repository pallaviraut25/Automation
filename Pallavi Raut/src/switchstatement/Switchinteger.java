package switchstatement;

public class Switchinteger {

	public static void main(String[] args) {

		int a = 10;

		switch (a) {
		case 2:
			System.out.println("Even number 2");
			break;
		case 4:
			System.out.println("Even number 4");
			break;

		case 6:
			System.out.println("Even number 6");
			break;
		case 8:
			System.out.println("Even number 8");
			break;
		case 10:
			System.out.println("Even number 10");
			break;

		default:
			System.out.println("None");
			break;

		}
// Print month Name on the basis of month number----Home Work

		int b = 11;

		switch (b) {

		case 1:
			System.out.println("Jan");
			break;

		case 2:
			System.out.println("feb");
			break;

		case 3:
			System.out.println("mar");
			break;

		case 4:
			System.out.println("apr");
			break;

		case 5:
			System.out.println("may");
			break;

		case 6:
			System.out.println("Jun");
			break;

		case 7:
			System.out.println("July");
			break;

		case 8:
			System.out.println("aug");
			break;

		case 9:
			System.out.println("sep");
			break;

		case 10:
			System.out.println("oct");
			break;

		case 11:
			System.out.println("Nov");
			break;

		case 12:
			System.out.println("dec");
			break;

		default:
			System.out.println("Invalid month name");
			break;
		}

		// Print week name on the basis of week number----Home Work

		int c = 7;

		switch (c) {

		case 1:
			System.out.println("Monday");
			break;

		case 2:
			System.out.println("Tuesday");
			break;

		case 3:
			System.out.println("Wednesday");
			break;

		case 4:
			System.out.println("Thursday");
			break;

		case 5:
			System.out.println("Fridat");
			break;

		case 6:
			System.out.println("Saturday");
			break;

		case 7:
			System.out.println("Sunday");
			break;

		default:
			System.out.println("Invalid week Name");
			break;

		}
	}

}
