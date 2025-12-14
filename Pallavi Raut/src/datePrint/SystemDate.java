package datePrint;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SystemDate {

	public static void main(String[] args) {

		Date d = new Date();
		System.out.println(d.toString());

		System.out.println("-------Print Date In Format------");

		// dd-MM-YYYY
		// MM-dd-YYYY
        //YYYY-dd-MM
		SimpleDateFormat s = new SimpleDateFormat("dd-MM-YYYY");
		System.out.println(s.format(d));

		System.out.println();

		SimpleDateFormat t = new SimpleDateFormat("MM-dd-YYYY");
		System.out.println(t.format(d));

		System.out.println();
		
		SimpleDateFormat k = new SimpleDateFormat("YYYY-dd-MM");
		System.out.println(k.format(d));
	}

}
