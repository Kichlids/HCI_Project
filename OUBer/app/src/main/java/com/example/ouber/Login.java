package com.example.ouber;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Login extends AppCompatActivity {

    private EditText userName;
    private EditText password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        userName= findViewById(R.id.etUserName);
        password= findViewById(R.id.etPassword);
        login= findViewById(R.id.btnLogin);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(userName.getText().toString(),password.getText().toString());
            }
        });
    }

    private void validate(String userNameValue, String passwordValue) {
        if(userNameValue.equals("admin") && passwordValue.equals("1234")) {
            Intent mainMenu = new Intent(Login.this, MainMenu.class);
            mainMenu.putExtra("userNameValue",userNameValue);
            startActivity(mainMenu);
        }
    }
}
