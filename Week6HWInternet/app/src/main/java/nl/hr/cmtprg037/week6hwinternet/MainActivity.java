package nl.hr.cmtprg037.week6hwinternet;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private final static String URI ="https://swapi.dev/api/people/";
    public final static String LOG_TAG = "Week6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void searchCharacter(View v) {
        EditText editText = findViewById(R.id.editTextNumber_id);
        getSwapi(editText.getText().toString());
    }

    private void getSwapi(String i) {
        RequestQueue queue = Volley.newRequestQueue(this);

        JsonObjectRequest jsonRequest = new JsonObjectRequest(Request.Method.GET, URI + i + "/", null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // Display the first 500 characters of the response string.
                        //textView.setText("Response is: "+ response.substring(0,500));
                        Log.d(LOG_TAG, "Request gelukt");
                        Log.d(LOG_TAG, response.toString());

                        try {
                            String name = response.getString("name");
                            TextView tv = findViewById(R.id.textView_result);
                            tv.setText(name);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.d(LOG_TAG, "That didn't work!: " + error);
                TextView tv = findViewById(R.id.textView_result);
                tv.setText("No such result.");
            }
        });

// Add the request to the RequestQueue.
        queue.add(jsonRequest);
    }
}