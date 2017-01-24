package com.example.yeasin.database_project;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;

import static android.R.attr.data;
import static android.R.attr.theme;

public class Jsondata_show extends AppCompatActivity {
    private TextView name, username;
    private ListView simplelist;
    private Button btnBack;

    // ArrayList<User> JsonList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jsondata_show);
        //all find id data
        allfindint();
        String url = "http://hitechwebdesign.net/yeasin/jasondata.php";
    }

    public void json_requst(String url) {
        RequestQueue requestQueue = Volley.newRequestQueue(this);

        StringRequest request = new StringRequest(Request.Method.GET, url, new Response.Listener<String>() {
            @Override
            public void onResponse(String response) {

                try {
                    JSONObject root = new JSONObject(response);
                    JSONArray userArray = root.getJSONArray("user");
                    JSONObject currentUser = userArray.getJSONObject(0);
                    String title = currentUser.getString("title");
                    Toast.makeText(Jsondata_show.this, title, Toast.LENGTH_SHORT).show();

                } catch (JSONException e) {
                    e.printStackTrace();
                }


            }
        }, new ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                VolleyLog.d("Volley log", error);

            }
        });
        requestQueue.add(request);

    }

    public void allfindint() {
        simplelist = (ListView) findViewById(R.id.list_view);
        name = (TextView) findViewById(R.id.jsoName);
        name = (TextView) findViewById(R.id.jsoName);
    }
}