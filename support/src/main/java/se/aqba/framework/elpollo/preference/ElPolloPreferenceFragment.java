package se.aqba.framework.elpollo.preference;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceFragment;

public class ElPolloPreferenceFragment extends PreferenceFragment {
    private static final String PREF_NAME = "elpollo_preferences";

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.getPreferenceManager().setSharedPreferencesMode(Context.MODE_WORLD_READABLE);
        this.getPreferenceManager().setSharedPreferencesName(PREF_NAME);
    }
}
