package nl.hr.cmtprg037.week3hwcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

// opdracht week 3 (count en reset) en 5 (save, restore en settings)

public class MainActivity extends AppCompatActivity {

    // houd de teller bij in een variabele voor de hele activity
    private int counter = 0;
    public final static String LOG_TAG = "Week3 en 5";
    public final static String PREF_COUNTER = "counter";
    public final static int PREF_COUNTER_DEFAULT = 0;
    public final static String PREF_BACKWARDS = "check_box_backwards";
    public final static boolean PREF_BACKWARDS_DEFAULT = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateCounter();
        updateRestoreButton();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("Week3 HW", "Start");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("Week3 HW", "Retart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("Week3 HW", "Resume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("Week3 HW", "Pause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("Week3 HW", "Stop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("Week3 HW", "Destroy");
    }

    public void onCount(View v) {
        if (PreferenceManager.getDefaultSharedPreferences(this).getBoolean(PREF_BACKWARDS, PREF_BACKWARDS_DEFAULT)) {
            counter--;
        } else {
            counter++;
        }

        updateCounter();
    }

    public void onReset(View v) {
        counter = 0;
        Toast t = Toast.makeText(this, "Reset", Toast.LENGTH_LONG);
        t.show();
        updateCounter();
    }

    public void saveCounter(View v) {
        // save counter to local prefs
        getPreferences(MODE_PRIVATE).edit().putInt(PREF_COUNTER, counter).commit();
        // update restore button
        updateRestoreButton();
    }

    public void restoreCounter(View v) {
        counter = getPreferences(MODE_PRIVATE).getInt(PREF_COUNTER, PREF_COUNTER_DEFAULT);
        updateCounter();
    }

    public void openSettings(View v) {
        Intent i = new Intent(this, SettingsActivity.class);
        startActivity(i);
    }

    private void updateCounter() {
        Log.d("Week3 HW", "Counter: " + counter);

        // in week 3 gebruikten we nog 'hard coded' tags, in week 5 kunnen we dat natuurlijk netter
        Log.d(LOG_TAG, "Counter: " + counter);
        TextView tv = findViewById(R.id.textView_counter);
        tv.setText(counter + "");
    }

    private void updateRestoreButton() {
        Button b = findViewById(R.id.button_restore);
        int i = getPreferences(MODE_PRIVATE).getInt(PREF_COUNTER, 0);
        b.setText("Restore (" + i + ")");
    }
}