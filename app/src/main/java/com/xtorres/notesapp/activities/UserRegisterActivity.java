package com.xtorres.notesapp.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.xtorres.notesapp.R;
import com.xtorres.notesapp.repositories.UserRepositorie;

public class UserRegisterActivity extends AppCompatActivity {

    private EditText usernameInput;
    private EditText fullnameInput;
    private EditText emailInput;
    private EditText passwordInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_register);

        usernameInput = findViewById(R.id.register_input_username);
        fullnameInput = findViewById(R.id.register_input_fullname);
        emailInput = findViewById(R.id.register_input_email);
        passwordInput = findViewById(R.id.register_input_password);

    }

    public void doRegister(View view){
        String username = usernameInput.getText().toString();
        String fullname = fullnameInput.getText().toString();
        String email = emailInput.getText().toString();
        String password = passwordInput.getText().toString();

        if(username.isEmpty() || fullname.isEmpty() || email.isEmpty() ||password.isEmpty()){
            Toast.makeText(this,"Completar todos los campos", Toast.LENGTH_SHORT).show();
            return;
        }

        UserRepositorie.create(username, fullname, email, password);

        finish();

    }

}
