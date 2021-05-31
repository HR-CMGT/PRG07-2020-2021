package nl.hr.cmtprg037.week3hwcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // houd de teller bij in een variabele voor de hele activity
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateCounter();
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
        counter++;
        updateCounter();
    }

    public void onReset(View v) {
        counter = 0;
        Toast t = Toast.makeText(this, "Reset", Toast.LENGTH_LONG);
        t.show();
        updateCounter();
    }

    private void updateCounter() {
        Log.d("Week3 HW", "Counter: " + counter);
        TextView tv = findViewById(R.id.textView_counter);
        tv.setText(counter + "");
    }
}