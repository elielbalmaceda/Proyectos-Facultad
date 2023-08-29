import java.util.TimeZone;
import java.util.Calendar;
import java.util.Scanner;
import java.util.GregorianCalendar;
public class App {
    //practica7 actividad5  
    public static void main(String[] args) throws Exception {
        int año, mes, dia;
        String letraD="";
        TimeZone TimeZone = TimeZone.getDefault();
        Calendar calendar = new GregorianCalendar(TimeZone);
        calendar.set(año ,mes-1, dia);
        int nD=calendarget (Calendar.DAY_OF_WEEK);
        System.out.println("resultado" "diaSemana: " +nD+" dia:"+dia+" mes:"+mes+
        "año:" +año);
        switch (nD){
        case 1: letraD = "D";
        break;
        case 2: letraD= "L";
        break;
        case 3: letraD = "M";
        break;
        case 4: letraD= "X";
        break;
        case 5: letraD= "J";
        break;
        case 6: letraD= "V";
        break;
        case 7: letraD= "S";
        break;
        }
    }
}
