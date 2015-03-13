package se.aqba.framework.elpollo.bridge;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;

/**
 *  This class' methods will be overridden by the framework.
 */
public class ElPolloBridge {
    private static final String TAG = "ElPolloBridge";

    private static final String PREFERENCES_FILE = "elpollo_preferences";

    /**
     * Is the framework installed?
     * @return Whether the framework is installed.
     */
    public static boolean isInstalled() {
        Log.w(TAG, "isInstalled was not overridden by the framework");
        return false;
    }

    /**
     * Get the framework version name (1.0 for example).
     * @return The framework version name.
     */
    public static String getVersion() {
        Log.w(TAG, "getVersion was not overridden by the framework");
        return "";
    }

    /**
     * Get the framework version code.
     * @return The framework version code.
     */
    public static int getVersionCode() {
        Log.w(TAG, "getVersionCode was not overridden by the framework");
        return 0;
    }

    /**
     * Get the framework version codename.
     * @return The framework version codename.
     */
    public static String getVersionCodename() {
        Log.w(TAG, "getVersionCodename was not overridden by the framework");
        return "";
    }

    /**
     * Get the {@link android.content.SharedPreferences} of the current module.
     * @param context The android context.
     * @return The preferences of the current module..
     */
    public static SharedPreferences getPreferences(Context context) {
        return context.getSharedPreferences(PREFERENCES_FILE, Context.MODE_WORLD_READABLE);
    }

    /**
     * Get the {@link android.content.SharedPreferences} of the system.
     * @return The preferences of the system.
     */
    public static SharedPreferences getSystemPreferences() {
        Log.w(TAG, "getSystemPreferences was not overridden by the framework");
        return null;
    }
}
