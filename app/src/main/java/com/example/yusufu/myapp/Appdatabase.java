package com.example.yusufu.myapp;


import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;


public abstract class Appdatabase extends RoomDatabase {

    public abstract AppDao appDao();
}
