package com.example.databases;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


import com.example.databases.data.MyDbHandler;
import com.example.databases.model.Contact;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MyDbHandler db = new MyDbHandler(MainActivity.this);

        // Creating a contact object for the db
        Contact nishim = new Contact();
        nishim.setPhoneNumber("90390522");
        nishim.setName("Nishim");

        // Adding a contact to the db
        db.addContact(nishim);

        // Creating a contact object for the db
        Contact raj = new Contact();
        raj.setPhoneNumber("90390521");
        raj.setName("Raj");

        // Adding a contact to the db
        db.addContact(raj);

        // Creating a contact object for the db
        Contact tehri = new Contact();
        tehri.setPhoneNumber("9090675409");
        tehri.setName("Tehri");

        // Adding a contact to the db
        db.addContact(tehri);
        Log.d("nishim", "Id for tehri and larry are successfully added to the db");

//        tehri.setId(46);
//        tehri.setName("Changed Tehri");
//        tehri.setPhoneNumber("0000000000");
//        int affectedRows = db.updateContact(tehri);

//        Log.d("nishim", "No of affected rows are: " + affectedRows);
        // Get all contacts
        List<Contact> allContacts = db.getAllContacts();
        for(Contact contact: allContacts){

            Log.d("nishim", "\nId: " + contact.getId() + "\n" +
                    "Name: " + contact.getName() + "\n"+
                    "Phone Number: " + contact.getPhoneNumber() + "\n" );


        }
        Log.d("nishim", "Bro you have "+ db.GetCount()+ " contacts in your database");



    }
}

