package com.example.form2;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    EditText etName, ethnic, etRegNo, etEmail;
    Button btnCancel, btnSubmit, btnBack, btnNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // Make sure this matches your XML file name

        // Link XML elements with Java
        etName = findViewById(R.id.et_name);
        ethnic = findViewById(R.id.et_cnic);
        etRegNo = findViewById(R.id.et_reg_no);
        etEmail = findViewById(R.id.et_email);

        btnCancel = findViewById(R.id.btn_cancel);
        btnSubmit = findViewById(R.id.btn_submit);
        btnBack = findViewById(R.id.btn_back);
        btnNext = findViewById(R.id.btn_next);

        // Cancel button
        btnCancel.setOnClickListener(v -> {
            Toast.makeText(this, "Cancelled", Toast.LENGTH_SHORT).show();
            etName.setText("");
            ethnic.setText("");
            etRegNo.setText("");
            etEmail.setText("");
        });

        // Submit button
        btnSubmit.setOnClickListener(v -> {
            String name = etName.getText().toString().trim();
            String cnic = ethnic.getText().toString().trim();
            String regNo = etRegNo.getText().toString().trim();
            String email = etEmail.getText().toString().trim();

            if (name.isEmpty() || cnic.isEmpty() || regNo.isEmpty() || email.isEmpty()) {
                Toast.makeText(this, "Please fill all fields", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Submitted Successfully!", Toast.LENGTH_SHORT).show();
            }
        });

        // Back button
        btnBack.setOnClickListener(v ->
                Toast.makeText(this, "Going Back...", Toast.LENGTH_SHORT).show()
        );

        // Next button (this opens DashboardActivity)
        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(SignUpActivity.this, DashboardActivity.class);
            startActivity(intent);
        });
    }
}
