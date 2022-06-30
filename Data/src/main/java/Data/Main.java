package Data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Main {

	public static void main(String[] args) throws Exception {

		Date now = new Date(); // Api date mostra a data atual.
		System.out.println(now);

		long time = now.getTime(); // Mostra os milesegundos desde 1 jan de 1970.
		System.out.println(time);

		Calendar cal = Calendar.getInstance();
		cal.set(2030, 1, 20, 14, 30, 20);
		cal.set(Calendar.YEAR, 2040); // Autera o ano.
		cal.set(Calendar.SECOND, 1); // Autera o segundo.

		cal.add(Calendar.MONTH, -1);// Soma ou subtrair Meses, Anos!

		System.out.println(cal.getTime());
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		Date d = sdf.parse("10/05/1982 10:23:50" ); // Mostra a data 		
		System.out.println(d);
		
		String s = sdf.format(d); // Formata e converte do formto Date para String
		System.out.println(s);
		
		 cal = Calendar.getInstance();
		 cal.setTime(d);
		 cal.add(Calendar.HOUR, 48);
		 System.out.println(cal.getTime());

	}
}
