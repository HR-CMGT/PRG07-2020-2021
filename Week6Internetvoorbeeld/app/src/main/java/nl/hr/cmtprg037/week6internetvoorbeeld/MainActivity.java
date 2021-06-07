package nl.hr.cmtprg037.week6internetvoorbeeld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.JsonRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    private final static String URI = "https://docent.cmi.hro.nl/bootb/groceries.json";
    private final static String LOG_TAG = "Week6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getGroceries();
    }

    private void getGroceries() {
        // Instantiate the RequestQueue.
        RequestQueue queue = Volley.newRequestQueue(this);

        // Request a string response from the provided URL.
        JsonObjectRequest jsonRequest = new JsonObjectRequest(Request.Method.GET, URI, null,
                new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        // Display the first 500 characters of the response string.
                        Log.d(LOG_TAG, response.toString());
                        showGroceries(response);
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                Log.e(LOG_TAG, "That didn't work!");
            }
        });

// Add the request to the RequestQueue.
        queue.add(jsonRequest);

    }

    private void showGroceries(JSONObject data) {
        try {
            JSONArray groceries = (JSONArray)data.get("groceries");
            for (int i = 0; i < groceries.length(); i++) {
                JSONObject item = (JSONObject)groceries.get(i);

                String name = (String)item.get("name");
                Log.d(LOG_TAG, name);
            }
        } catch (JSONException e) {
            Log.e(LOG_TAG, "JSON exeption");
        }
    }
}