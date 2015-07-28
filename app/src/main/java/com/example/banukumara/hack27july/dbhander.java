package com.example.banukumara.hack27july;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class dbhander extends SQLiteOpenHelper {

    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "DiaryEntries.db";
    public static final String TABLE_OF_FILES = "diaryentries";
    public static final String COLUMN_NAME = "_name";
    public static final String COLUMN_CONTENT = "content";


    public dbhander(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE " + TABLE_OF_FILES + "(" +
                COLUMN_NAME + " STRING PRIMARY KEY, " +
                COLUMN_CONTENT + " STRING " +
                ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS" + TABLE_OF_FILES);
        onCreate(db);
    }

    //Add a new row to the database
    public void addEntry(datablase_of_files file) {
        ContentValues values = new ContentValues();
        values.put(COLUMN_NAME, file.get_content());
        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_OF_FILES, null, values);
        db.close();
    }

    //delete product fromd database
    public void deleteEntry(String content) {
        SQLiteDatabase db = getWritableDatabase();
        db.execSQL("DELETE FROM " + TABLE_OF_FILES + " WHERE " + COLUMN_CONTENT + "=\"" + content + "\";");
    }

    //Print out the database as a string
    public String databaseToString() {
        String dbString = "";
        SQLiteDatabase db = getWritableDatabase();
        String query = "SELECT * FROM " + TABLE_OF_FILES + "WHERE 1";

        //Cursor point to the location in your results
        Cursor c = db.rawQuery(query, null);
        //move to the 1st row in the results
        c.moveToFirst();

        while(!c.isAfterLast()){
            if(c.getString(c.getColumnIndex("content")) != null) {
                dbString += c.getString(c.getColumnIndex("content"));
                dbString += "\n";
            }
        }
        db.close();
        return dbString;
    }

}
