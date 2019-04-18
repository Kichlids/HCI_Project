package com.example.ouber;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FindTrips extends AppCompatActivity {

    private Button back;
    private Button join1;
    private Button join2;
    private TextView name1;
    private TextView name2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_trips);

        back= findViewById(R.id.btnBack);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        join1=findViewById(R.id.btnJoin1);
        join1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmation();
            }
        });

        join2=findViewById(R.id.btnJoin2);
        join2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                confirmation();
            }
        });

        name1=findViewById(R.id.tvName1);
        name1.setPaintFlags(name1.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        name1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent TripDetails = new Intent(FindTrips.this, TripDetails.class);
                startActivity(TripDetails);
            }
        });
        name2=findViewById(R.id.tvName2);
        name2.setPaintFlags(name2.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
    }


    public void confirmation(){
        DialogInterface.OnClickListener dialogClickListener = new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                switch (which){
                    case DialogInterface.BUTTON_POSITIVE:
                        //Yes button clicked
                        Intent gotoScreenVar = new Intent(FindTrips.this, MainMenu.class);
                        gotoScreenVar.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_SINGLE_TOP);
                        startActivity(gotoScreenVar);
                        break;

                    case DialogInterface.BUTTON_NEGATIVE:
                        //No button clicked
                        break;
                }
            }
        };

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure?").setPositiveButton("Yes", dialogClickListener)
                .setNegativeButton("No", dialogClickListener).show();
    }

}
