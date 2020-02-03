package com.example.mypreloaddata.database;

import android.provider.BaseColumns;

public class DatabaseContract {
    public static String TABLE_NAME = "table_mahasiswa";

    public static final class MahasiswaColumns implements BaseColumns {
        public static String _ID = "id";
        public static String NAMA = "nama";
        public static String NIM = "nim";
    }
}
