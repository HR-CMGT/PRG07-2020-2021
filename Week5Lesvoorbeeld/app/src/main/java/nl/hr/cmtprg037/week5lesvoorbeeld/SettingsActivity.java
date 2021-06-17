package nl.hr.cmtprg037.week5lesvoorbeeld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.preference.PreferenceManager;
import android.util.Log;
import android.widget.Toast;

// need to implement OnSharedPreferenceChangeListener to respond to changes
public class SettingsActivity extends PreferenceActivity implements SharedPreferences.OnSharedPreferenceChangeListener {

    public final static String OPT_SOUND = "key_sound";
    public final static boolean OPT_SOUND_DEFAULT = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        addPreferencesFromResource(R.xml.settings);
    }

    // register change event when visible
    @Override
    protected void onResume() {
        PreferenceManager.getDefaultSharedPreferences(this).registerOnSharedPreferenceChangeListener(this);
        super.onResume();
    }

    // unregister change event when no longer visible
    @Override
    protected void onPause() {
        PreferenceManager.getDefaultSharedPreferences(this).unregisterOnSharedPreferenceChangeListener(this);
        super.onPause();
    }

    public static boolean isSoundOn(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context).getBoolean(OPT_SOUND, OPT_SOUND_DEFAULT);
    }

    // implement callback for change
    @Override
    public void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String pref_key) {
        Log.d(MainActivity.LOG_TAG, "Preferences are changes");
        Toast t = Toast.makeText(this, "Pref changed: " + pref_key, Toast.LENGTH_SHORT);
        t.show();
    }
}