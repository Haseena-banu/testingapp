package com.contactapp.testingapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.google.android.material.textfield.TextInputLayout;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity2 extends AppCompatActivity {
     Button button2,button3;
 TextInputLayout name,phone_number,email;
 FirebaseDatabase rootNode;
 DatabaseReference reference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        //name= findViewById(R.id.name1);
       // phone_number= findViewById(R.id.phno2);
        //email= findViewById(R.id.mailf);
        button2=(Button) findViewById(R.id.save1);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rootNode= FirebaseDatabase.getInstance();
                reference= rootNode.getReference("user");
                String name1= name.getEditText().getText().toString();
                String phno1= phone_number.getEditText().getText().toString();
                String email1= email.getEditText().getText().toString();
                userinfo user= new userinfo(name1,phno1,email1);
                reference.setValue(user);
            }
        });
    }

    }


