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
    String Message, flName;

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
                }
            }
        });
    }

    public void goToHome(View view) {
        finish();
    }
}
