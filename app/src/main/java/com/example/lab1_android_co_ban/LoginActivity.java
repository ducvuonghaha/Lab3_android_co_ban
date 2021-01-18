package com.example.lab1_android_co_ban;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputLayout;

import de.hdodenhof.circleimageview.CircleImageView;

public class LoginActivity extends AppCompatActivity {

    private CircleImageView imvAvatarLogin;
    private TextView tvTitle;
    private TextView tvWelcome;
    private TextInputLayout layoutUsername;
    private EditText edtUsername;
    private TextInputLayout layoutPassword;
    private EditText edtPassword;
    private CheckBox ckRememberPass;
    private Button btnSignIn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initView();
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(LoginActivity.this, "Đăng nhập thành công", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void initView() {
        imvAvatarLogin = (CircleImageView) findViewById(R.id.imvAvatarLogin);
        tvTitle = (TextView) findViewById(R.id.tvTitle);
        tvWelcome = (TextView) findViewById(R.id.tvWelcome);
        layoutUsername = (TextInputLayout) findViewById(R.id.layoutUsername);
        edtUsername = (EditText) findViewById(R.id.edtUsername);
        layoutPassword = (TextInputLayout) findViewById(R.id.layoutPassword);
        edtPassword = (EditText) findViewById(R.id.edtPassword);
        ckRememberPass = (CheckBox) findViewById(R.id.ckRememberPass);
        btnSignIn = (Button) findViewById(R.id.btnSignIn);
    }
}