package com.example.dashbaord;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class DashboardActivity extends AppCompatActivity {

    TextView tvWelcome, tvTotalLoan, tvStatus;
    Button btnApplyLoan, btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard); // matches XML file name

        // Link XML IDs
        tvWelcome = findViewById(R.id.tv_welcome);
        tvTotalLoan = findViewById(R.id.tv_total_loan);
        tvStatus = findViewById(R.id.tv_status);
        btnApplyLoan = findViewById(R.id.btn_apply_loan);
        btnLogout = findViewById(R.id.btn_logout);

        // Apply Loan Button
        btnApplyLoan.setOnClickListener(v ->
                Toast.makeText(this, "Loan Application Page Coming Soon!", Toast.LENGTH_SHORT).show()
        );

        // Logout Button → Go back to SignUpActivity
        btnLogout.setOnClickListener(v -> {
            Toast.makeText(this, "Logging Out...", Toast.LENGTH_SHORT).show();
            Intent intent = new Intent(DashboardActivity.this, SignUpActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
