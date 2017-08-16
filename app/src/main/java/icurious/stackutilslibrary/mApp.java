package icurious.stackutilslibrary;

import android.app.Application;

import icurious.stackutils.StackUtils;

/**
 * Created by Towhid on 8/16/17.
 */

public class mApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        StackUtils.register(getApplicationContext());
    }
}
