package com.example.voltfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;



public class selectveh1 extends AppCompatActivity {
    private Button button;
    private  ImageButton imagebutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectveh1);

        button = findViewById(R.id.addVehiclesButton);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setContentView(R.layout.activity_homemap);
            }
        });

        imagebutton= findViewById(R.id.backButton);
        imagebutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               selectbrand();
            }
        });
    }
    public void selectbrand(){
        Intent intent = new Intent(selectveh1.this, LoginActivity.class);
        startActivity(intent);
    }
}
