package icurious.stackutils;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Towhid on 7/24/17.
 */

public class DateTime {
    private static final DateTime ourInstance = new DateTime();
    private NumberFormat nf = NumberFormat.getInstance();
    private SimpleDateFormat month, month_year, y_m_d;

    public static DateTime getInstance() {
        return ourInstance;
    }

    private DateTime() {
        month = new SimpleDateFormat("MMMM", Locale.getDefault());
        y_m_d = new SimpleDateFormat("yyyy_MM_dd", Locale.getDefault());
        month_year = new SimpleDateFormat("MMMM yyyy", Locale.getDefault());
    }


    public String formatMonthYear(String dateString) {
        return month_year.format(getDateFromString(dateString));
    }

    public String formatDayName(String dateString) {
        int d = Integer.parseInt(dateString.split("_")[2]);
        Calendar cal = Calendar.getInstance();
        if (cal.get(Calendar.DAY_OF_MONTH) == d)
            return "Today";
        else if (cal.get(Calendar.DAY_OF_MONTH) - d == 1)
            return "Yesterday";
        else cal.set(Calendar.DAY_OF_MONTH, d);
        return cal.getDisplayName(Calendar.DAY_OF_WEEK, Calendar.LONG, Locale.getDefault());
    }

    public String formatMoney(double amount) {
        return nf.format(amount) + " ৳";
    }

    public String formatDate() {
        return formatDate(new Date());
    }

    public String formatDate(Date date) {
        return y_m_d.format(date);
    }

    public Date getDateFromString(String date) {
        Date d = null;
        try {
            d = y_m_d.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return d;
    }

    public String getMonthName(String date_string) {
        return month.format(getDateFromString(date_string));
    }

    public String LCase(String str) {
        return Character.toUpperCase(str.charAt(0)) + str.substring(1);
    }
}
