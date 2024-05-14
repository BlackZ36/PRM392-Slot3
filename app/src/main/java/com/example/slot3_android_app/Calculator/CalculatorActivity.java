package com.example.slot3_android_app.Calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.slot3_android_app.R;

public class CalculatorActivity extends AppCompatActivity {

    private Button calBtn;
    private EditText etA, etB, etC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_calculator);

        etA = findViewById(R.id.etA);
        etB = findViewById(R.id.etB);
        etC = findViewById(R.id.etC);
        calBtn = findViewById(R.id.btnCalculate);

        calBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String inputA = etA.getText().toString();
                    String inputB = etB.getText().toString();
                    String inputC = etC.getText().toString();

                    if (inputA.isEmpty() || inputB.isEmpty() || inputC.isEmpty()) {
                        Toast.makeText(CalculatorActivity.this, "Please enter all field", Toast.LENGTH_SHORT).show();
                        return;
                    }

                    double a = Double.parseDouble(inputA);
                    double b = Double.parseDouble(inputB);
                    double c = Double.parseDouble(inputC);

                    solveQuadraticEquation(a, b, c);
                } catch (NumberFormatException e) {
                    Toast.makeText(CalculatorActivity.this, "Invalid number", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


    private void solveQuadraticEquation(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        String result;

        if (a == 0) {
            result = "This is not a quadratic equation.";
        } else if (discriminant > 0) {
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            result = "2 nghiem phan biet: \nnghiem 1: " + root1 + "\nnghiem 2: " + root2;
        } else if (discriminant == 0) {
            double root = -b / (2 * a);
            result = "nghiem kep: \nRoot: " + root;
        } else {
            result = "vo nghiem.";
        }

        // Display the result in an alert dialog
        AlertDialog.Builder builder = new AlertDialog.Builder(CalculatorActivity.this);
        builder.setTitle("Calculation Result");
        builder.setMessage(result);
        builder.setPositiveButton("OK", null);
        builder.show();
    }
}