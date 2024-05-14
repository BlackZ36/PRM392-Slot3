package com.example.slot3_android_app.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.slot3_android_app.R;

public class LoginActivity extends AppCompatActivity {

    private Button loginBtn;
    private EditText usernameTxt, passwordTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_login);

        loginBtn = findViewById(R.id.lgBtn);
        usernameTxt = findViewById(R.id.usernameTxt);
        passwordTxt = findViewById(R.id.passwordTxt);

        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameTxt.getText().toString();
                String password = passwordTxt.getText().toString();

                if ((username.equals("admin") && password.equals("admin")) || (username.equals("user") && password.equals("user"))) {
                    Intent intent = new Intent(LoginActivity.this, LoginSuccessActivity.class);
                    intent.putExtra("USERNAME", username);
                    startActivity(intent);
                } else {
                    Toast.makeText(LoginActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                }

            }
        });

    }
}