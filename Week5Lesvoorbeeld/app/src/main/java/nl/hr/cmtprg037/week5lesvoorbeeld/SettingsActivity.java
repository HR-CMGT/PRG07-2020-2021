package nl.hr.cmtprg037.week5lesvoorbeeld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;

public class SettingsActivity extends PreferenceActivity {

    public final static String OPT_SOUND = "key_sound";
    public final static boolean OPT_SOUND_DEFAULT = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.settings);
    }

    public static boolean isSoundOn(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(OPT_SOUND, OPT_SOUND_DEFAULT);
    }
}