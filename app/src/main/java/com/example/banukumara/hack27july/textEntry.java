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
<<<<<<< HEAD
    String Message;
=======
<<<<<<< HEAD
    String Message;
=======
    String Message, flName;
>>>>>>> c4958d3ad0f95e4ba79fa319e05bf11951a12f2a
>>>>>>> 0065cc97550d395b31dfc6ecf497a22d33d43012

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
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 0065cc97550d395b31dfc6ecf497a22d33d43012
                Message = message.getText().toString();
                if (Message.matches("")) {
                    Toast.makeText(getBaseContext(), "Please enter some content.", Toast.LENGTH_LONG).show();
                }
                else {
                    startActivity(new Intent(textEntry.this, pop.class));
<<<<<<< HEAD
=======
=======
                startActivity(new Intent(textEntry.this, pop.class));
                SharedPreferences sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
                Message = message.getText().toString();
                flName = sharedPreferences.getString("fileName", DEFAULT);
                if (flName.equals(DEFAULT)) {
                    Toast.makeText(getBaseContext(), "No data was found", Toast.LENGTH_LONG).show();
                }
                else {
                    try {
                        FileOutputStream fou = openFileOutput(flName, Context.MODE_PRIVATE);
                        OutputStreamWriter osw = new OutputStreamWriter(fou);
                        try {
                            osw.write(Message);
                            osw.flush();
                            osw.close();
                            Toast.makeText(getBaseContext(), "Data saved!", Toast.LENGTH_LONG).show();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
>>>>>>> c4958d3ad0f95e4ba79fa319e05bf11951a12f2a
>>>>>>> 0065cc97550d395b31dfc6ecf497a22d33d43012
                }
            }
        });
    }

    public void goToHome(View view) {
        finish();
    }
}
