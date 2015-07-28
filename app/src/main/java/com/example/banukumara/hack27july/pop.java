package com.example.banukumara.hack27july;

import android.app.Activity;
import android.content.Context;
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ce74420e510df1c701fa005763718fac40d953a4
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.DisplayMetrics;
<<<<<<< HEAD
=======
=======
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.DisplayMetrics;
<<<<<<< HEAD
>>>>>>> 0065cc97550d395b31dfc6ecf497a22d33d43012
>>>>>>> ce74420e510df1c701fa005763718fac40d953a4
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
<<<<<<< HEAD
import android.widget.TextView;
import android.widget.Toast;
=======
<<<<<<< HEAD
import android.widget.TextView;
import android.widget.Toast;
=======
import android.widget.Toast;
=======
import android.view.View;
import android.widget.EditText;
>>>>>>> c4958d3ad0f95e4ba79fa319e05bf11951a12f2a
>>>>>>> 0065cc97550d395b31dfc6ecf497a22d33d43012
>>>>>>> ce74420e510df1c701fa005763718fac40d953a4

/**
 * Created by Banukumar A on 27-07-2015.
 */
public class pop extends Activity {

<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ce74420e510df1c701fa005763718fac40d953a4
    Button button4;
    EditText fName;
    TextView editText2;
    String flName;
    dbhander mydbhandler;
<<<<<<< HEAD
=======
=======
<<<<<<< HEAD
    Button button4;
    EditText fName;
    String flName;
    dbhander mydbhandler;
=======
    EditText fName;
>>>>>>> c4958d3ad0f95e4ba79fa319e05bf11951a12f2a
>>>>>>> 0065cc97550d395b31dfc6ecf497a22d33d43012
>>>>>>> ce74420e510df1c701fa005763718fac40d953a4

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupwindow);
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> 0065cc97550d395b31dfc6ecf497a22d33d43012
>>>>>>> ce74420e510df1c701fa005763718fac40d953a4

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
<<<<<<< HEAD
                } else {
=======
<<<<<<< HEAD
                } else {
=======
                }
                else {
>>>>>>> 0065cc97550d395b31dfc6ecf497a22d33d43012
>>>>>>> ce74420e510df1c701fa005763718fac40d953a4
                    //Insert into database
                    datablase_of_files file = new datablase_of_files(fName.getText().toString());
                    mydbhandler.addEntry(file);
                    Toast.makeText(getBaseContext(), flName, Toast.LENGTH_LONG).show();
                    finish();
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> ce74420e510df1c701fa005763718fac40d953a4
                    startActivity(new Intent(pop.this, main_after_input.class));
                }
            }
        });
<<<<<<< HEAD
=======
=======
                }
            }
        });
=======
        fName=(EditText)findViewById(R.id.editText3);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        double width = dm.widthPixels;
        double hight = dm.heightPixels;

        getWindow().setLayout((int)width,(int)(hight*.6));
>>>>>>> c4958d3ad0f95e4ba79fa319e05bf11951a12f2a
>>>>>>> 0065cc97550d395b31dfc6ecf497a22d33d43012
>>>>>>> ce74420e510df1c701fa005763718fac40d953a4
    }

    public void saveName(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("fileName",fName.getText().toString());
        editor.commit();
    }
}
