package nl.hr.cmtprg037.week5lesvoorbeeld;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public final static String LOG_TAG = "Week5";
    public final static String VARIABLE_NAME = "number";
    public final static String RETURN_VARIABLE_NAME = "result";
    public final static int PHOTO = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void onResume() {
        Log.d(LOG_TAG, "Sound: " + SettingsActivity.isSoundOn(this));

        super.onResume();
    }

    public void startSecondActivirt(View v) {
        Log.d(LOG_TAG, "Stuur waarde");
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        i.putExtra(VARIABLE_NAME, 10);

        startActivityForResult(i, PHOTO);
    }

    public void openSettings(View v) {
        Intent i =  new Intent(this, SettingsActivity.class);
        startActivity(i);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if ((requestCode == PHOTO) && (resultCode == RESULT_OK)) {
            int n = data.getIntExtra(RETURN_VARIABLE_NAME, 0);
            Log.d(LOG_TAG, "Result: " + n);
        } else {
            Log.d(LOG_TAG, "Er is iets mis gegaan");
        }


        super.onActivityResult(requestCode, resultCode, data);
    }
}