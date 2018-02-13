package com.example.user.gp_t1_xml;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class BookingHotelActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking_hotel);

        Button btn_assureReserve = (Button)findViewById(R.id.buttonAssureReserve);
        btn_assureReserve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BookingHotelActivity.this, "Thanks for reservation", Toast.LENGTH_SHORT).show();
                Intent i = new Intent(BookingHotelActivity.this, homeActivity.class);
                startActivity(i);
            }
        });
    }
}
