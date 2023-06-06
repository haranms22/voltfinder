package com.example.voltfinder;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    private Button signupBtn;
    private EditText nameEdt, emailEdt,phnedit, passEdt, repassEdt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);


        initView();
        setVariable();


        Button button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()

        {
            @Override
            public void onClick (View v){
                setContentView(R.layout.activity_selectveh1);

            }
        });
    }

    private void setVariable() {
        signupBtn.setOnClickListener(v -> {
            if (nameEdt.getText().toString().trim().isEmpty() || emailEdt.getText().toString().trim().isEmpty() || phnedit.getText().toString().trim().isEmpty()
                    || passEdt.getText().toString().trim().isEmpty() || repassEdt.getText().toString().trim().isEmpty()) {
                Toast.makeText(signup.this, "Please Fill the signup form", Toast.LENGTH_SHORT).show();
            } else if (!passEdt.getText().toString().trim().equals(repassEdt.getText().toString().trim())) {
                Toast.makeText(signup.this, "Your password is not matched", Toast.LENGTH_SHORT).show();
            } else {
                startActivity(new Intent(signup.this, selectveh1.class));
            }
        });
    }



    private void initView() {
        signupBtn = findViewById(R.id.button);
        nameEdt = findViewById(R.id.editTextTextPersonName);
        phnedit= findViewById(R.id.editphnnumber);
        emailEdt = findViewById(R.id.editTextTextEmail);
        passEdt = findViewById(R.id.editTextPassword);
        repassEdt = findViewById(R.id.editTextRepassword);
    }
    }

