package com.example.yusufu.myapp;

import android.annotation.SuppressLint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class AddNewActivity extends AppCompatActivity {

    EditText itname;
    EditText etitem;
    EditText itQuantity;
    EditText itamount;
    TextView itView;
    EditText itdate;
    EditText itlocation;
    EditText itcontact;
    EditText itemail;
    EditText itcomment;


    String name;
    String item;
    String Quantity;
    String amount;
    String Mode;
    String date;
    String location;
    String contact;
    String email;
    String comment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new);

        itname = findViewById(R.id.itname);
        etitem = findViewById(R.id.etitem);
        itQuantity = findViewById(R.id.itQuantity);
        itamount = findViewById(R.id.itamount);
        itView = findViewById(R.id.itView);
        itdate = findViewById(R.id.itdate);
        itcontact= findViewById(R.id.itcontact);
        itemail = findViewById(R.id.itemail);
        itcomment = findViewById(R.id.itcomment);
    }
}
