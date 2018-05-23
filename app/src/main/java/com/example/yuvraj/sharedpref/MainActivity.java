package com.example.yuvraj.sharedpref;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    SharedPreferences sharedpreferences;
    public static final String MyPREFERENCES = "MyPrefs" ;

    private EditText edtuid, edtpwd;
    private Button button;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);

        edtuid = (EditText) findViewById(R.id.edtuid);
        edtpwd = (EditText) findViewById(R.id.edtpwd);
        button = (Button) findViewById(R.id.button);







        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final String un = edtuid.getText().toString();
                final String pw = edtpwd.getText().toString();

                SharedPreferences  sharedpreferences = getSharedPreferences("user", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedpreferences.edit();
                editor.putString("username" , un);
                editor.putString("password" , pw);
                editor.commit();

                    Intent intent = new Intent(MainActivity.this, Home.class);
                    startActivity(intent);

                }

        });

    }
}
