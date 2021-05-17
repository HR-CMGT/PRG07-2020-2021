package nl.hr.cmtprg037.week3lesvoorbeeld;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button_next);
        button.setOnClickListener(this);

    }

    @Override
    protected void onResume() {
        Log.d("Week3", "onResume");
        super.onResume();
    }

    @Override
    public void onClick(View view) {
        Log.d("Week3", "Click");
        Intent i = new Intent(MainActivity.this, SecondActivity.class);
        startActivity(i);
    }
}