package com.example.yusufu.myapp;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;


public class Detail extends AppCompatActivity {
    private TextView etamount;
    private TextView itname;
    private TextView ititem;
    private TextView itquantity;
    private TextView itmod;
    private TextView itdate;
    private TextView itlocation;
    private TextView itcontact;
    private TextView itemail;
    private TextView itcomment;
    private int itemid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        etamount = findViewById(R.id.etamount);
        itname = findViewById(R.id.etcustomer);
        ititem = findViewById(R.id.itpen);
        itquantity = findViewById(R.id.quantityvalue);
        itmod = findViewById(R.id.modevalue);
        itdate = findViewById(R.id.datevalue);
        itlocation = findViewById(R.id.locationvalue);
        itcontact = findViewById(R.id.contactvalue);
        itemail = findViewById(R.id.emailvalue);
        itcomment = findViewById(R.id.itcomment);

        Intent intent = getIntent();
        if (intent != null && intent.hasExtra(Intent.EXTRA_TEXT)) {
            itemid = intent.getIntExtra(Intent.EXTRA_TEXT, -1);
            NewOrder newOrder = getDb().appDao().getNeworderByid(itemid);
            UpdateUI(newOrder);
        }

    }

    private void UpdateUI(NewOrder newOrder) {
        ititem.setText(newOrder.getItem());
        etamount.setText(newOrder.getAmount());
        itname.setText(newOrder.getName());
        itquantity.setText(newOrder.getQuantity());
        itdate.setText(newOrder.getDate());
        itlocation.setText(newOrder.getLocation());
        itcontact.setText(newOrder.getContact());
        itemail.setText(newOrder.getEmail());
        itcomment.setText(newOrder.getComment());
    }

    private Appdatabase getDb() {
        String date_Name = "room_db";
        Appdatabase db = Room.databaseBuilder(getApplicationContext(), Appdatabase.class,
                date_Name).allowMainThreadQueries().build();
        return db;
    }

}
