package icurious.stackutils.constants;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by Towhid on 8/16/17.
 */

public enum DateFormat {

    //"yyyy.MM.dd G 'at' HH:mm:ss z"	2001.07.04 AD at 12:08:56 PDT
    //"EEE, MMM d, ''yy"	Wed, Jul 4, '01
    //"h:mm a"	12:08 PM
    //"hh 'o''clock' a, zzzz"	12 o'clock PM, Pacific Daylight Time
    //"K:mm a, z"	0:08 PM, PDT
    //"yyyyy.MMMMM.dd GGG hh:mm aaa"	02001.July.04 AD 12:08 PM
    //"EEE, d MMM yyyy HH:mm:ss Z"	Wed, 4 Jul 2001 12:08:56 -0700
    ymdhms("yyMMddHHmmss"),//010704120856
    y_m_d_h_m_s("yyyy-MM-dd_HH:mm:ss")    //2001-07-04T12:08:56.235-0700
    ;

    public SimpleDateFormat sdf;

    DateFormat(String format) {
        sdf = new SimpleDateFormat(format, Locale.getDefault());
    }
}
