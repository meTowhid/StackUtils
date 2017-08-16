package icurious.stackutils;

import android.content.Context;

/**
 * Created by Towhid on 8/16/17.
 */

public class StackUtils {

    public static Context sContext;

    public static void register(Context context) {
        sContext = context.getApplicationContext();
    }
}
