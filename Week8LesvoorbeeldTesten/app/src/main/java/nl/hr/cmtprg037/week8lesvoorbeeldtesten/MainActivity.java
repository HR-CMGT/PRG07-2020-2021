package nl.hr.cmtprg037.week8lesvoorbeeldtesten;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateResult(View w) {
        EditText et_a = findViewById(R.id.editTextNumber_a);
        EditText et_b = findViewById(R.id.editTextNumber_b);

        String a = et_a.getText().toString();
        String b = et_b.getText().toString();

        // hiertussen moet nog de berekening komen

        String c = Calculator.add(a, b);

        TextView tv_c = findViewById(R.id.textView_c);
        tv_c.setText(c);


    }
}