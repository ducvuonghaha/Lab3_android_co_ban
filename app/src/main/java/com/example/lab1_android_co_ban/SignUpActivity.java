package com.example.lab1_android_co_ban;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

public class SignUpActivity extends AppCompatActivity {

    private TextView tvTitle;
    private TextInputLayout layoutFullname;
    private EditText edtFullname;
    private TextInputLayout layoutUsername;
    private EditText edtUsername;
    private TextInputLayout layoutEmail;
    private EditText edtEmail;
    private TextInputLayout layoutPassword;
    private EditText edtPassword;
    private TextInputLayout layoutRePassword;
    private EditText edtRePassword;
    private Button btnSignIn;
    private Button btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        initView();
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUpActivity.this, "Đăng ký thành công", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        layoutFullname = (TextInputLayout) findViewById(R.id.layoutFullname);
        edtFullname = (EditText) findViewById(R.id.edtFullname);
        layoutUsername = (TextInputLayout) findViewById(R.id.layoutUsername);
        edtUsername = (EditText) findViewById(R.id.edtUsername);
        layoutEmail = (TextInputLayout) findViewById(R.id.layoutEmail);
        edtEmail = (EditText) findViewById(R.id.edtEmail);
        layoutPassword = (TextInputLayout) findViewById(R.id.layoutPassword);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        layoutRePassword = (TextInputLayout) findViewById(R.id.layoutRePassword);
        edtRePassword = (EditText) findViewById(R.id.edtRePassword);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);
        btnSignUp = (Button) findViewById(R.id.btnSignUp);
    }
}