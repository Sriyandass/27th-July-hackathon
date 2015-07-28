package com.example.banukumara.hack27july;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**
 * Created by Banukumar A on 27-07-2015.
 */
public class textEntry extends Activity {

    Button button2;
    EditText message;
    String Message;

    public static final String DEFAULT="N/A";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_new_entry);

        button2=(Button)findViewById(R.id.button2);
        message=(EditText)findViewById(R.id.editText);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Message = message.getText().toString();
                if (Message.matches("")) {
                    Toast.makeText(getBaseContext(), "Please enter some content.", Toast.LENGTH_LONG).show();
                }
                else {
                    startActivity(new Intent(textEntry.this, pop.class));
                }
            }
        });
    }

    public void goToHome(View view) {
        finish();
    }
}
