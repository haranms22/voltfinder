package com.example.voltfinder;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;
import java.util.List;

public class selectbrand extends AppCompatActivity {

    private ImageButton backButton;
    private TextView titleTextView;
    private SearchView searchBar;
    private ListView brandListView;

    private List<String> electricBrands = Arrays.asList(
            "Tata Motors",
            "Mahindra Electric",
            "Hero Electric",
            "MG Motors",
            "Ather Energy",
            "Revolt Motors"
            // Add more electric vehicle brands here
    );

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectbrand);

        backButton = findViewById(R.id.backButton);
        titleTextView = findViewById(R.id.titleTextView);
        searchBar = findViewById(R.id.searchBar);
        brandListView = findViewById(R.id.brandListView);

        backButton.setOnClickListener(v -> onBackPressed());

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, electricBrands);
        brandListView.setAdapter(adapter);

        brandListView.setOnItemClickListener((parent, view, position, id) -> {
            String selectedBrand = electricBrands.get(position);
            Toast.makeText(selectbrand.this, "Selected brand: " + selectedBrand, Toast.LENGTH_SHORT).show();
            // Perform further action based on the selected brand
        });
    }
}
