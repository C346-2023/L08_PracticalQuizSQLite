package com.example.practicalquizsqlite;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.util.ArrayList;

public class DBHelper extends SQLiteOpenHelper {
    private static final int DATABASE_VER = 1;
    private static final String DATABASE_NAME = "schools.db";
    private static final String TABLE_SCHOOL = "school";
    private static final String COLUMN_ID = "id";
    private static final String COLUMN_NUM_OF_STU = "num_of_stu";
    private static final String COLUMN_SCHOOL_NAME = "school_name";

    public DBHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VER);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        //ToDo
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_SCHOOL);
        onCreate(db);
    }

    public void insertSchool(String numOfStudent, String schoolName){
        //ToDo
    }

    public ArrayList<School> getSchools() {
        //ToDO
    }
}
