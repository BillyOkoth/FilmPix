package com.example.filmpix;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import android.content.Intent;

import com.example.filmpix.EquipmentActivity;
import com.example.filmpix.LoginActivity;

public class MainActivity extends AppCompatActivity {

    Button btn_profile, btn_cart, btn_equipment, btn_logout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_profile = findViewById(R.id.buttonProfile);
        btn_cart = findViewById(R.id.buttonCart);
        btn_equipment = findViewById(R.id.buttonEquipment);
        btn_logout = findViewById(R.id.buttonLogout);


        btn_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Profile Clicked", Toast.LENGTH_SHORT).show();

                Intent in = new Intent(MainActivity.this, ProfileActivity.class);
                startActivity(in);

            }
        });

        btn_cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Cart Clicked", Toast.LENGTH_SHORT).show();

                Intent in = new Intent(MainActivity.this, CartActivity.class);
                startActivity(in);
            }
        });

        btn_equipment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Equipment Clicked", Toast.LENGTH_SHORT).show();

                Intent in = new Intent(MainActivity.this, EquipmentActivity.class);
                startActivity(in);
            }
        });

        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "Logged Out", Toast.LENGTH_SHORT).show();

                Intent in = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(in);
            }
        });

    }


}