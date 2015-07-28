package com.example.banukumara.hack27july;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * Created by Banukumar A on 27-07-2015.
 */
public class pop extends Activity {

    Button button4;
    EditText fName;
    String flName;
    dbhander mydbhandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        double width = dm.widthPixels;
        double hight = dm.heightPixels;
        getWindow().setLayout((int) width, (int) (hight * .6));

        fName=(EditText)findViewById(R.id.editText3);
        button4=(Button)findViewById(R.id.button4);
        mydbhandler = new dbhander(this, null, null, 1);
        button4.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                flName = fName.getText().toString();

                if (flName.matches("")) {
                    Toast.makeText(getBaseContext(), "Please enter a name.", Toast.LENGTH_LONG).show();
                }
                else {
                    //Insert into database
                    datablase_of_files file = new datablase_of_files(fName.getText().toString());
                    mydbhandler.addEntry(file);
                    Toast.makeText(getBaseContext(), flName, Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });
    }

    public void saveName(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("fileName",fName.getText().toString());
        editor.commit();
    }
}
