package com.example.thammy.vollypractise;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;

public class MainActivity extends AppCompatActivity {
    Button but ;
    Button b1 ;
    Button b2 ;
    Button b3 ;
    TextView out;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = (Button)findViewById(R.id.button);
        b1 = (Button)findViewById(R.id.btns1);
        b2 = (Button)findViewById(R.id.btns2);
        b3 = (Button)findViewById(R.id.btns3);
        out = (TextView)findViewById(R.id.txtq);
        but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fetchvote();
            }
        });
    }

    private void fetchvote() {
        //String code = "12345";
        String url = "http://clickertest.co.za/index.php/API/Api/questions?id=2016";



        JsonArrayRequest req = new JsonArrayRequest(url,
                new Response.Listener<JSONArray>() {
                    @Override
                    public void onResponse(JSONArray response) {

                        if (response.length() > 0) {

                            try {
                                if (response.getJSONObject(0).getString("statusvote").toString() !="close") {
                                    String title = response.getJSONObject(0).getString("label_question");
                                    String suggest1 = response.getJSONObject(0).getString("suggest1");
                                    String suggest2 = response.getJSONObject(0).getString("suggest2");
                                    String suggest3 = response.getJSONObject(0).getString("suggest3");

                                    questions q = new questions(title,suggest1,suggest2,suggest3);

                                    out.setText(q.getTitle_question().toString());
                                    b1.setText(q.getSuggest1().toString());
                                    b2.setText(q.getSuggest2().toString());
                                    b3.setText(q.getSuggest3().toString());
                                }
                            } catch (JSONException e) {
                                Toast.makeText(getApplicationContext().getApplicationContext(), "Bad", Toast.LENGTH_LONG).show();
                            }
                        }

                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

                Toast.makeText(getApplicationContext().getApplicationContext(), error.getMessage(), Toast.LENGTH_LONG).show();



            }
        });

        // Adding request to request queue
        Volley.newRequestQueue(this).add(req);
    }
}
