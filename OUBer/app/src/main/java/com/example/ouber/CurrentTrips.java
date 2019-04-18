package com.example.ouber;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.graphics.Paint;
public class CurrentTrips extends AppCompatActivity {

    private Button back;
    private TextView tripName;
    private TextView tripTimePeriod;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_trips);

        back=findViewById(R.id.btnBack);
        tripName=findViewById(R.id.tvTripName);
        tripTimePeriod=findViewById(R.id.tvTripTimePeriod);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        tripName.setText("Walmart");
        tripTimePeriod.setText("9:00 AM - 11:00 AM");
        tripName.setPaintFlags(tripName.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

        tripName.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent TripDetails = new Intent(CurrentTrips.this, TripDetails.class);
                startActivity(TripDetails);
            }
        });
    }
}
