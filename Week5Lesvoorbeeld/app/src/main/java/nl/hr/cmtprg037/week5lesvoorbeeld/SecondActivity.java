package nl.hr.cmtprg037.week5lesvoorbeeld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent i = getIntent();
        int n = i.getIntExtra(MainActivity.VARIABLE_NAME, 0);

        Log.d(MainActivity.LOG_TAG, "Number: " + n);
    }

    public void returnResult(View v) {
        Intent i = new Intent();
        i.putExtra(MainActivity.RETURN_VARIABLE_NAME, 5);
        setResult(RESULT_OK, i);
        finish();
    }
}