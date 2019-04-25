package com.example.ouber;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

public class MainMenu extends AppCompatActivity {

    private TextView userName;
    String userNameValue;


    private Button currentTrips;
    private Button newTrip;
    private Button findTrip;
    private Button myFriends;
    private Button myGroups;
    private Button eventFinder;
    private Button localMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);
        userNameValue = getIntent().getExtras().getString("userNameValue");
        String greetMessage = "Hello, "+userNameValue;
        userName=findViewById(R.id.tvUserName);
        userName.setText(greetMessage);

        currentTrips= findViewById(R.id.btnCurrentTrips);
        newTrip= findViewById(R.id.btnNewTrips);
        findTrip= findViewById(R.id.btnFindTrip);
        myFriends= findViewById(R.id.btnMyFriends);
        myGroups= findViewById(R.id.btnMyGroups);
        eventFinder= findViewById(R.id.btnEventFinder);
        localMap = findViewById(R.id.btnLocalMap);

        currentTrips.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent CurrentTrips = new Intent(MainMenu.this, CurrentTrips.class);
                startActivity(CurrentTrips);
            }
        });
        newTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent NewTrip_Map = new Intent(MainMenu.this, NewTrip_Map.class);
                startActivity(NewTrip_Map);
            }
        });
        findTrip.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent FindTrips = new Intent(MainMenu.this, FindTrips.class);
                startActivity(FindTrips);
            }
        });

        myFriends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent MyFriends = new Intent(MainMenu.this, MyFriends.class);
                startActivity(MyFriends);
            }
        });

        myGroups.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        eventFinder.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        localMap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent LocalMap = new Intent(MainMenu.this, LocalMap.class);
                startActivity(LocalMap);
            }
        });
    }

}
