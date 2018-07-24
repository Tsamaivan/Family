package com.example.yusufu.myapp;


import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import java.util.List;

@Dao
public interface AppDao {

    @Query("SELECT * FROM  NewOrder")
    List<NewOrder> getNeworderfromDb();

    @Query("SELECT * FROM NewOrder WHERE Id = id")
    NewOrder getNeworderByid(int id);

    @Insert
    void insertNeworder(NewOrder newOrder);

    @Delete
    void deletNeworder(NewOrder user);
    @Update
    void updateNeworder(NewOrder user);

}
