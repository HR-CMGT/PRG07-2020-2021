package nl.hr.cmtprg037.week3lesvoorbeeld;

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

        Log.d("Week3", "Tweede activity (onCreate)");
    }

    public void finishSecondActivity(View view) {
        Log.d("Week3", "Finish");
        finish();
    }
}