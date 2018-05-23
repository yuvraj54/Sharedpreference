package com.example.yuvraj.sharedpref;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    private TextView tvid, tvpwd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        tvid = (TextView) findViewById(R.id.tvid);
        tvpwd = (TextView) findViewById(R.id.tvpwd);

        SharedPreferences preferences = getSharedPreferences("user", Context.MODE_PRIVATE);
        final String email = (preferences.getString("username", ""));
        final String password = (preferences.getString("password", ""));




        String KEY_EMAIL = "username";
        if (preferences.contains(KEY_EMAIL)) {
            tvid.setText(preferences.getString(KEY_EMAIL, ""));
        }
        else{
            tvid.setText("");
        }

        String KEY_pass = "password";
        if (preferences.contains(KEY_pass)) {
            tvpwd.setText(preferences.getString(KEY_pass, ""));
        }
        else{
            tvpwd.setText("");
        }

    }
}
