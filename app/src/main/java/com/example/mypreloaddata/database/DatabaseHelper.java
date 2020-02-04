package com.example.mypreloaddata.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import static com.example.mypreloaddata.database.DatabaseContract.MahasiswaColumns.NAMA;
import static com.example.mypreloaddata.database.DatabaseContract.MahasiswaColumns.NIM;
import static com.example.mypreloaddata.database.DatabaseContract.MahasiswaColumns._ID;
import static com.example.mypreloaddata.database.DatabaseContract.TABLE_NAME;

public class DatabaseHelper extends SQLiteOpenHelper {

    private static String DATABASE_NAME = "dbmahasiswa";

    private static final int DATABASE_VERSION = 1;

//    private static String CREATE_TABLE_MAHASISWA = "create table " + TABLE_NAME + " (" + _ID + " integer primary key autoincrement, " + NAMA + " text not null, " + NIM + " text not null);";

    private static String CREATE_TABLE_MAHASISWA = "create table " + TABLE_NAME +
            " (" + _ID + " integer primary key autoincrement, " +
            NAMA + " text not null, " +
            NIM + " text not null);";

    public DatabaseHelper(@Nullable Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(CREATE_TABLE_MAHASISWA);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(db);
    }
}
