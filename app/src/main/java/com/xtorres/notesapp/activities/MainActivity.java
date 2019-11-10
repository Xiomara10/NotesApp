package com.xtorres.notesapp.activities;

import android.content.Intent;
import android.support.v4.view.PagerTitleStrip;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.xtorres.notesapp.R;
import com.xtorres.notesapp.models.User;
import com.xtorres.notesapp.repositories.UserRepositorie;

public class MainActivity extends AppCompatActivity {

    private EditText usernameInput;
    private EditText passwordInput;
    private Button loginButton;
    private Button logupButton;
    private static final int GO_HOME_ACIVITY = 100;
    private static final int REGISTER_FORM_REQUEST = 300;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        usernameInput = findViewById(R.id.login_input_name);
        passwordInput = findViewById(R.id.login_input_password);
        loginButton = findViewById(R.id.button_login);
        logupButton = findViewById(R.id.button_logup);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callHome();
            }
        });

        logupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                callFormRegister();
            }
        });

    }

    public void callHome(){

        String username = usernameInput.getText().toString();
        String password = passwordInput.getText().toString();

        Intent intent = new Intent(this, HomeActivity.class);
        startActivityForResult(intent, GO_HOME_ACIVITY);

    }

    public void callFormRegister(){
        Intent intent = new Intent(this, UserRegisterActivity.class);
        startActivityForResult(intent, REGISTER_FORM_REQUEST);
    }

}
