package com.example.banukumara.hack27july;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.EditText;

/**
 * Created by Banukumar A on 27-07-2015.
 */
public class pop extends Activity {

    EditText fName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popupwindow);
        fName=(EditText)findViewById(R.id.editText3);
        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        double width = dm.widthPixels;
        double hight = dm.heightPixels;

        getWindow().setLayout((int)width,(int)(hight*.6));
    }

    public void saveName(View view) {
        SharedPreferences sharedPreferences = getSharedPreferences("MyData", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();
        editor.putString("fileName",fName.getText().toString());
        editor.commit();
    }
}
