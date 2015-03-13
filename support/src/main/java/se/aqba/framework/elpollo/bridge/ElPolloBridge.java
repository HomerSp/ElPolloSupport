package se.aqba.framework.elpollo.bridge;

import android.content.Context;
import android.content.SharedPreferences;

/**
 *  This class' methods will be overridden by the framework.
 */
public class ElPolloBridge {
    private static final String PREFERENCES_FILE = "elpollo_preferences";

    /**
     * Is the framework installed?
     * @return Whether the framework is installed.
     */
    public static boolean isInstalled() {
        return getVersionCode() != 0;
    }

    /**
     * Get the framework version name (1.0 for example).
     * @return The framework version name.
     */
    public static String getVersion() {
        return "";
    }

    /**
     * Get the framework version code.
     * @return The framework version code.
     */
    public static int getVersionCode() { return 0; }

    /**
     * Get the framework version codename.
     * @return The framework version codename.
     */
    public static String getVersionCodename() { return ""; }

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
    public static SharedPreferences getSystemPreferences() { return null; }
}
