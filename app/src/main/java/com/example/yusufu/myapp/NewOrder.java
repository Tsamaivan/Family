package com.example.yusufu.myapp;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;
import android.widget.EditText;

@Entity(tableName = "order")
public class NewOrder {

    private String name;
    private String item;
    private String quantity;
    private String amount;
    private String date;
    private String location;
    private String contact;
    private String email;
    private String comment;
    @PrimaryKey(autoGenerate = true)
    private int id;

    public NewOrder(String name, String item, String quantity, String amount, String date, String location, String contact, String email, String comment, int id) {
        this.name = name;
        this.item = item;
        this.quantity = quantity;
        this.amount = amount;
        this.date = date;
        this.location = location;
        this.contact = contact;
        this.email = email;
        this.comment = comment;
        this.id = id;
    }

    @Ignore
    public NewOrder(String name, String item, String quantity, String amount, String date, String location, String contact, String email, String comment) {
        this.name = name;
        this.item = item;
        this.quantity = quantity;
        this.amount = amount;
        this.date = date;
        this.location = location;
        this.contact = contact;
        this.email = email;
        this.comment = comment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
